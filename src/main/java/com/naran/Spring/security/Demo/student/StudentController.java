package com.naran.Spring.security.Demo.student;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    List<StudentDetails>students =new ArrayList<>(List.of(
            new StudentDetails(1,"Naran ","java"),
            new StudentDetails(2,"kiran","sql")

    ));

    @GetMapping("csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request){

        return (CsrfToken) request.getAttribute("_csrf");

    }

    @GetMapping("students")
    public List<StudentDetails>getStudent(){

        return  students;
    }
    @PostMapping("students")


    public void addStudent(@RequestBody StudentDetails studentDetails)
    {
        students.add(studentDetails);
    }

}


