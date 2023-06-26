package com.example.build_music.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "musics")
public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(columnDefinition = "LONGTEXT",nullable = false)
    private String name;
    @Column(columnDefinition = "VARCHAR(300)",nullable = false)
    private String artist;
    @Column(columnDefinition = "LONGTEXT",nullable = false)
    private String musicType;
    @Column(name = "is_delete")
    private boolean flagDelete;

    public Music() {
    }

    public Music(String name, String artist, String musicType) {
        this.name = name;
        this.artist = artist;
        this.musicType = musicType;
    }

    public Music(Integer id, String name, String artist, String musicType, boolean flagDelete) {
        this.id = id;
        this.name = name;
        this.artist = artist;
        this.musicType = musicType;
        this.flagDelete = flagDelete;
    }

    public Music(Integer id, String name, String artist, String musicType) {
        this.id = id;
        this.name = name;
        this.artist = artist;
        this.musicType = musicType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getMusicType() {
        return musicType;
    }

    public void setMusicType(String musicType) {
        this.musicType = musicType;
    }

    public boolean isFlagDelete() {
        return flagDelete;
    }

    public void setFlagDelete(boolean flagDelete) {
        this.flagDelete = flagDelete;
    }
}
