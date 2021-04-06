package com.example.springtestlibrary.controller;

import com.example.springtestlibrary.repository.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthorController {

    final
    AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @GetMapping("/authors")
    public String findAllAuthorsAndBooks(Model model) {

        model.addAttribute("authors", authorRepository.findAll());

        return "authors/list";
    }
}
