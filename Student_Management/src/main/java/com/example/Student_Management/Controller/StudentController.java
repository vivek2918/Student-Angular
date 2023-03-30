package com.example.Student_Management.Controller;

import com.example.Student_Management.Models.Student;
import com.example.Student_Management.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    public ResponseEntity createStudent(@RequestBody Student student){
        studentService.createStudent(student);
        return new ResponseEntity<>("Student Added Successfully",HttpStatus.ACCEPTED);
    }

    @GetMapping("/list")
    public ResponseEntity getAllStudent(){
        List<Student> studentList = studentService.getAllStudent();
        return new ResponseEntity<>(studentList, HttpStatus.ACCEPTED);
    }
}
