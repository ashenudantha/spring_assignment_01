package edu.icet.ecom.controller;

import edu.icet.ecom.model.Student;
import edu.icet.ecom.service.StudentService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class StudentController {

    StudentService studentService = new StudentService();

    @GetMapping("/get-student-details")
    public Student getStudent(){
       return studentService.getStudent();
    }



}
