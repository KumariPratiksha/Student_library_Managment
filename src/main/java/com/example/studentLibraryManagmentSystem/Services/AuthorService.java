package com.example.studentLibraryManagmentSystem.Services;

import com.example.studentLibraryManagmentSystem.Models.Author;
import com.example.studentLibraryManagmentSystem.Repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {
    @Autowired
    AuthorRepository authorRepository;
    public String createauthor(Author author){
        authorRepository.save((author));
        return "Author added sussesfully";
    }
}
