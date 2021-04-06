package com.example.springtestlibrary.controller;

import com.example.springtestlibrary.repository.PublisherRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PublisherController {

    final
    PublisherRepository publisherRepository;

    public PublisherController(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    @GetMapping("/publishers")
    public String findPublisher(Model model) {

        model.addAttribute("publishers", publisherRepository.findAll());

        return "publishers/list";
    }

}
