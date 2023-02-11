package com.example.studentLibraryManagmentSystem.Repositories;

import com.example.studentLibraryManagmentSystem.Models.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card,Integer> {
}
