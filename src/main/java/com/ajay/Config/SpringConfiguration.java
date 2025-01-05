package com.ajay.Config;
import com.ajay.controller.StudentController;
import com.ajay.dao.StudentDao;
import com.ajay.service.StudentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.ajay"})
public class SpringConfiguration {
    @Bean
    public StudentDao studentDao(){
        return new StudentDao();
    }

    @Bean
    public StudentController studentController(){
        return new StudentController(studentService());
    }

    @Bean
    public StudentService studentService(){
        return new StudentService(studentDao());
    }
}
