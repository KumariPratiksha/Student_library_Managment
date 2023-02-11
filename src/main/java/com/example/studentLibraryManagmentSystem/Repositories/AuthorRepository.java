package com.example.studentLibraryManagmentSystem.Repositories;

import com.example.studentLibraryManagmentSystem.Models.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
