package com.meuprojeto.tratamento.de.exception.Controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.meuprojeto.tratamento.de.exception.DTOs.SongDTO;
import com.meuprojeto.tratamento.de.exception.Entities.Song;
import com.meuprojeto.tratamento.de.exception.Services.SongService;


@RestController
public class SongController {
		
		@Autowired
		public SongService songService;
		
		@GetMapping(path = "/songs")
		public List<SongDTO> findAllSongs(){
			return songService.findAllSongs();
		}
		
		@GetMapping(path = "/songs/{id}")
		public  SongDTO FindMusicById(@PathVariable Long id) {
			return songService.findSong(id);
		}
		
		@PostMapping(path = "/songs")
		public ResponseEntity<Void> insertSong(@RequestBody Song song){
			URI uri = songService.insertSong(song);
			return ResponseEntity.created(uri).build();
		}
}
