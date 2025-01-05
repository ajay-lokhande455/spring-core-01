package com.ajay.service;

import com.ajay.dao.StudentDao;
import com.ajay.model.Student;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class StudentService {
    private StudentDao studentDao;
    public void AddStudent(Student student) {
        studentDao.add(student);
    }
}
