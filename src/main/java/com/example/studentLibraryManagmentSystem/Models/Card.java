package com.example.studentLibraryManagmentSystem.Models;

import com.example.studentLibraryManagmentSystem.Enums.CardStatus;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Table(name = "card")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @CreationTimestamp // auto update the time creation
    Date createdOn;
    @UpdateTimestamp
    Date updatedOn;
    @Enumerated(value = EnumType.STRING)
    private CardStatus cardStatus;

    public Card(){

    }


}
