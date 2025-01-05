package com.ajay.dao;

import com.ajay.model.Student;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentDao {
    public void add(Student student) {
        System.out.println(student);
    }
}
