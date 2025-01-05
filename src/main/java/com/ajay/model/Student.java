package com.ajay.model;

import lombok.*;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder

@Component
public class Student {
    private String name;
    private int age;
    private String gender;
    private String address;
}
