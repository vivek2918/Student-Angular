package com.example.Student_Management.Repository;

import com.example.Student_Management.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}
