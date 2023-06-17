package com.example.dictionary.service;

import org.springframework.ui.Model;

public interface IDictionaryService {
    void search(String name, Model model);
}
