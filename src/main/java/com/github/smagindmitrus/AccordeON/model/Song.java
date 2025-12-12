package com.github.smagindmitrus.AccordeON.model;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data

public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String artist;

    @Column(columnDefinition = "TEXT")
    private String lyrics;

    private String chords; // Пока просто строка, потом сделаем сложнее
}
