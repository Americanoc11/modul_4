package com.example.build_music.repository;

import com.example.build_music.model.Music;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IMusicRepository extends JpaRepository<Music, Integer> {
    List<Music> findAllByFlagDeleteIsFalse();
}
