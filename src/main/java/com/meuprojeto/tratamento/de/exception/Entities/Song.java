package com.meuprojeto.tratamento.de.exception.Entities;


import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_song")
public class Song {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(columnDefinition = "TEXT", name ="song_name")
	private String name;
	private Integer songYear;
	private String artist;
	
	public Song() {
		
	}	
		
	public Song(Long id,String name, Integer songYear, String artist) {
		this.id = id;
		this.name = name;
		this.songYear = songYear;
		this.artist = artist;
	}


	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getSongYear() {
		return songYear;
	}


	public void setSongYear(Integer songYear) {
		this.songYear = songYear;
	}


	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Song other = (Song) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
