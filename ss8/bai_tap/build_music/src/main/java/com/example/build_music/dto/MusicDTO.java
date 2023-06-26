package com.example.build_music.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


public class MusicDTO {
    private Integer id;
    @Size(min = 1, max = 800, message = "Tên bài hát tối đa 800 kí tự")
    @NotBlank(message = "Không được phép để trống")
    @Pattern(regexp = "^[\\w ]+$", message = "Không được chứa các kí tự đặc biệt")
    private String name;
    @Size(min = 1, max = 300, message = "Tên bài hát tối đa 800 kí tự")
    @NotBlank(message = "Không được phép để trống")
    @Pattern(regexp = "^[\\w ]+$", message = "Không được chứa các kí tự đặc biệt")

    private String artist;
    @Size(min=1,max = 1000, message = "Tên bài hát tối đa 800 kí tự")
    @NotBlank(message = "Không được phép để trống")
    @Pattern(regexp = "^[\\w ]+$", message = "Không được chứa các kí tự đặc biệt")

    private String musicType;
    private boolean flagDelete;

    public MusicDTO() {
    }

    public MusicDTO(String name, String artist, String musicType) {
        this.name = name;
        this.artist = artist;
        this.musicType = musicType;
    }

    public MusicDTO(Integer id, String name, String artist, String musicType) {
        this.id = id;
        this.name = name;
        this.artist = artist;
        this.musicType = musicType;
    }

    public MusicDTO(Integer id, String name, String artist, String musicType, boolean flagDelete) {
        this.id = id;
        this.name = name;
        this.artist = artist;
        this.musicType = musicType;
        this.flagDelete = flagDelete;
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
