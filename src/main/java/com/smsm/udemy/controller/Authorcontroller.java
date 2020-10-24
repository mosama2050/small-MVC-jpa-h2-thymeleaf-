package com.smsm.udemy.controller;


import com.smsm.udemy.repositories.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Authorcontroller {
    private final AuthorRepository authorRepository;

    public Authorcontroller(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/Authors")
    public String getBooks(Model model){
        model.addAttribute("A", authorRepository.findAll());
        return "books/auth";
    }
}
