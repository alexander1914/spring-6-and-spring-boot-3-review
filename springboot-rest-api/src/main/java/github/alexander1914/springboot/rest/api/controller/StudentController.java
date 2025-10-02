package github.alexander1914.springboot.rest.api.controller;

import github.alexander1914.springboot.rest.api.bens.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("student")
    public Student getStudent(){
        Student student = new Student(
                1,
                "Alexander",
                "Oliveira"
        );

        return student;
    }

    @GetMapping("students")
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Alexander", "Oliveira"));
        students.add(new Student(2, "Vivian", "Less"));
        students.add(new Student(3, "Bruna", "Carlos"));
        students.add(new Student(2, "Ericka", "Alvar's"));

        return students;
    }
}
