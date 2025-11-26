package com.meuprojeto.tratamento.de.exception.DTOs;

import com.meuprojeto.tratamento.de.exception.Entities.Song;

public class SongDTO {

	private Long id;
	private String name;
	private Integer songYear;
	private String artist;
	
	public SongDTO() {
		
	}	
		
	public SongDTO(Song song) {
		id = song.getId();
		name = song.getName();
		songYear = song.getSongYear();
		artist = song.getArtist();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Integer getSongYear() {
		return songYear;
	}

	public String getArtist() {
		return artist;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSongYear(Integer songYear) {
		this.songYear = songYear;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}		
	
}
