package com.example.studentLibraryManagmentSystem.Repositories;

import com.example.studentLibraryManagmentSystem.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer>{

}
