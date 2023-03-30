package com.example.Student_Management.Services;

import com.example.Student_Management.Models.Student;
import com.example.Student_Management.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public String createStudent(Student student){
        studentRepository.save(student);
        return"Student Added Successfully";
    }

    public List<Student> getAllStudent(){
        return studentRepository.findAll();
    }


}
