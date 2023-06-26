package com.example.build_music.service;

import com.example.build_music.model.Music;
import com.example.build_music.repository.IMusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicService implements IMusicService {
    @Autowired
    private IMusicRepository iMusicRepository;


    @Override
    public List<Music> findAllByFlagDeleteIsFalse() {
        return iMusicRepository.findAllByFlagDeleteIsFalse();
    }

    @Override
    public Music save(Music music) {
        music.setFlagDelete(false);
        return iMusicRepository.save(music);
    }

    @Override
    public void update(Music music) {
        boolean check = this.exitsById(music.getId());
        if (check) {
            iMusicRepository.save(music);
        } else {
            this.findById(music.getId());
        }
    }

    @Override
    public Music findById(Integer id) {
        return this.iMusicRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Not found Id" + id));
    }

    @Override
    public void delete(Integer id) {
        Music music = this.findById(id);
        music.setFlagDelete(true);
        iMusicRepository.save(music);
    }

    @Override
    public boolean exitsById(Integer id) {
        return iMusicRepository.existsById(id);
    }
}
