package com.ajay.controller;

import com.ajay.model.Student;
import com.ajay.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class StudentController {

    private StudentService studentService;

    public void AddStudent(Student student) {
        studentService.AddStudent(student);
    }

}
