package com.example.studentLibraryManagmentSystem.Services;

import com.example.studentLibraryManagmentSystem.Enums.CardStatus;
import com.example.studentLibraryManagmentSystem.Models.Card;
import com.example.studentLibraryManagmentSystem.Models.Student;
import com.example.studentLibraryManagmentSystem.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public String createStudent(Student student){
        Card card = new Card();
        card.setCardStatus(CardStatus.ACTIVATED);
        card.setStudentVariableName(student);

        student.setCard(card);
        studentRepository.save(student);

        return "Student and card added";

    }
}
