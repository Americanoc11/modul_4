package com.example.build_music.service;

import com.example.build_music.model.Music;

import java.util.List;

public interface IMusicService {
    List<Music> findAllByFlagDeleteIsFalse();

    Music save(Music music);

    Music findById(Integer id);

    void update(Music music);

    void delete(Integer id);

    boolean exitsById(Integer id);
}
