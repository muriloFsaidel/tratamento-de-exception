package com.meuprojeto.tratamento.de.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import java.net.URI;
import java.time.LocalDateTime;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import com.meuprojeto.tratamento.de.exception.DTOs.SongDTO;
import com.meuprojeto.tratamento.de.exception.Entities.Song;
import com.meuprojeto.tratamento.de.exception.Handlers.InvalidYearException;
import com.meuprojeto.tratamento.de.exception.Repositories.SongRepository;
import com.meuprojeto.tratamento.de.exception.Services.SongService;

@SpringBootTest
class TratamentoDeExceptionApplicationTests {
	@InjectMocks
    private SongService songService;

    @Mock
    private SongRepository songRepository;

    @Mock
    private Song songMock;

    @Mock
    private SongDTO songDTOMock;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testFindSong() {
        Long songId = 1L;

        // Arrange
        Song song = new Song();
        song.setId(songId);
        when(songRepository.findById(songId)).thenReturn(Optional.of(song));

        // Act
        SongDTO result = songService.findSong(songId);

        // Assert
        assertNotNull(result);
        assertEquals(songId, result.getId());
    }

    @Test
    void testInsertSong() {
        // Arrange
        Song song = new Song();
        song.setSongYear(2020);
        when(songRepository.save(song)).thenReturn(song);

        // Act
        URI location = songService.insertSong(song);

        // Assert
        assertNotNull(location);
        assertTrue(location.toString().contains("/1"));
    }

    @Test
    void testInsertSongWithInvalidYear() {
        // Arrange
        Song song = new Song();
        song.setSongYear(2025); // Um ano no futuro, maior que o ano atual

        // Act & Assert
        InvalidYearException exception = assertThrows(InvalidYearException.class, () -> {
            songService.insertSong(song);
        });
        assertEquals("Ano inválido, insira algo menor do que " + LocalDateTime.now().getYear(), exception.getMessage());
    }
	
	@Test
	void contextLoads() {
	}
}
