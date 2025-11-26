package com.meuprojeto.tratamento.de.exception.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.meuprojeto.tratamento.de.exception.Entities.Song;

@Repository
public interface SongRepository extends JpaRepository<Song, Long>{

}
