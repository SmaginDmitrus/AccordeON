package com.github.smagindmitrus.AccordeON.repository;
import com.github.smagindmitrus.AccordeON.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {
}