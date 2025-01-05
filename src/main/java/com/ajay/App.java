package com.ajay;

import com.ajay.Config.SpringConfiguration;
import com.ajay.controller.StudentController;
import com.ajay.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        Student student = Student.builder()
                .name("Ajay")
                .age(21)
                .address("Washim")
                .gender("Male")
                .build();

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        StudentController controller = context.getBean(StudentController.class);
        controller.AddStudent(student);

    }
}
