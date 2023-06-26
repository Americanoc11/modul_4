package com.example.build_music.service;

import com.example.build_music.model.Music;

import java.util.List;

public interface IMusicService {
    List<Music> findAll();

    Music save(Music music);

    Music update(Music music);

    Music findById(Integer id);

    void delete(Integer id);
    boolean exitsById(Integer id);
}
