package com.example.build_music.controller;

import com.example.build_music.model.Music;
import com.example.build_music.service.IMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.Entity;
import java.util.List;

@Controller
@RequestMapping("musics")
public class MusicController {
    @Autowired
    private IMusicService iMusicService;

    @GetMapping("")
    public String showList(Model model) {
        List<Music> musicList = iMusicService.findAll();
        model.addAttribute("music", new Music());
        model.addAttribute("musicList", musicList);
        return "/list";
    }
}
