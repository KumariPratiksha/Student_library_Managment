package com.example.studentLibraryManagmentSystem.Controllers;

import com.example.studentLibraryManagmentSystem.Models.Author;
import com.example.studentLibraryManagmentSystem.Services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("author")
public class AuthorController {
    @Autowired
    AuthorService authorService;

    @PostMapping("/add")

    public String addAuthor(@RequestBody Author author){
        return authorService.createauthor(author) ;

    }
}
