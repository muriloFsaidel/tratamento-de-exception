package com.meuprojeto.tratamento.de.exception.Services;

import java.net.URI;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.meuprojeto.tratamento.de.exception.DTOs.SongDTO;
import com.meuprojeto.tratamento.de.exception.Entities.Song;
import com.meuprojeto.tratamento.de.exception.Handlers.InvalidYearException;
import com.meuprojeto.tratamento.de.exception.Repositories.SongRepository;

@Service
public class SongService {
	
	@Autowired
	private SongRepository songRepository;
	
	public SongDTO findSong(Long id) {
		return new SongDTO(songRepository.findById(id).get());
	}	
	
	public List<SongDTO> findAllSongs(){
		List<SongDTO> songs = new ArrayList<>();
		for(Song song : songRepository.findAll() ) {
			songs.add(new SongDTO(song));
		}
		return songs;
	}
	
	public URI insertSong(Song song) {
		invalidYear(song.getSongYear());
		SongDTO songDTO = new SongDTO(songRepository.save(song));
		return ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(songDTO.getId()).toUri();
		 
	}

	private void invalidYear(int songYear){
		if(songYear > LocalDateTime.now().getYear()) {
			throw new InvalidYearException("Ano inválido, insira algo menor do que "+LocalDateTime.now().getYear());
		}
	}

}
