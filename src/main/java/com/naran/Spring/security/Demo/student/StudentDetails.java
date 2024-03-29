package com.naran.Spring.security.Demo.student;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDetails {
    private int id;
    private  String name;
    private String tech;

//    public void add(StudentDetails studentDetails) {
//    }
}
