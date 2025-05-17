package edu.icet.ecom.service;

import edu.icet.ecom.model.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    public Student getStudent(){
        Student student = new Student("kamal", "galle", 22);

        return student;

    }
}
