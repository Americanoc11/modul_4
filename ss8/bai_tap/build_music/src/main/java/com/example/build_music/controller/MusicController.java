package com.example.build_music.controller;

import com.example.build_music.dto.MusicDTO;
import com.example.build_music.model.Music;
import com.example.build_music.service.IMusicService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.persistence.Entity;
import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("musics")
public class MusicController {
    @Autowired
    private IMusicService iMusicService;

    @GetMapping("")
    public String showList(Model model) {
        List<Music> musicList = iMusicService.findAllByFlagDeleteIsFalse();
        model.addAttribute("musicList", musicList);
        return "/list";
    }

    @GetMapping("/create")
    public String showNewForm(Model model) {
        model.addAttribute("music", new Music());
        return "/create";
    }

    @PostMapping("/create")
    public String addMusic(@Valid @ModelAttribute("music") MusicDTO musicDTO, BindingResult bindingResult, Model model,RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("music", musicDTO);
            return "/create";
        }
        Music musicEntity = new Music();
        BeanUtils.copyProperties(musicDTO, musicEntity);
        iMusicService.save(musicEntity);
        redirectAttributes.addFlashAttribute("msg", "Add success");
        return "redirect:/musics";
    }

    @GetMapping("/update/{id}")
    public String showEditForm(@PathVariable("id") Integer id, RedirectAttributes redirectAttributes, Model model) {
        boolean check = iMusicService.exitsById(id);
        if (check) {
            model.addAttribute("music", iMusicService.findById(id));
        } else {
            redirectAttributes.addFlashAttribute("msg", "Invalid Id");
        }
        return "/edit";
    }

    @PostMapping("/update")
    public String updateMusic(@Valid @ModelAttribute("music") MusicDTO musicDTO, BindingResult bindingResult, Model model, RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("music", musicDTO);
            return "/edit";
        }
        Music musicEntity = new Music();
        BeanUtils.copyProperties(musicDTO, musicEntity);
        iMusicService.update(musicEntity);
        redirectAttributes.addFlashAttribute("msg", "Update success");
        return "redirect:/musics";
    }

    @PostMapping("/delete")
    public String deleteMusic(@RequestParam("id") Integer id, RedirectAttributes redirectAttributes, Model model) {
        boolean check = iMusicService.exitsById(id);
        if (check) {
            iMusicService.delete(id);
            redirectAttributes.addFlashAttribute("msg", "Delete success");
        } else {
            redirectAttributes.addFlashAttribute("msg", "Invalid Id");
        }
        return "redirect:/musics";
    }
}
