package com.codes.register.controller;


import com.codes.register.model.Student;
import com.codes.register.respository.StudentRepository;
import com.codes.register.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
@CrossOrigin(origins = "http://localhost:3000")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student) {
        studentService.saveStudent(student);
        return "New student is added";
    }
    @PutMapping("/student/{id}")
    public String update(@PathVariable ("id")Integer id, @RequestBody Student student) {
        Student student1 = studentService.getByID(id);
        student1.setName(student.getName());
        student1.setAddress(student.getAddress());
        studentService.saveStudent(student1);
        return "student is updated";
    }

    @GetMapping("/getAll")
    public List<Student> getAllStudents() {
        //studentService.getById();
        return studentService.getAllStudent();
    }

    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable("id") Integer id) {

        return studentService.getByID(id);
    }

    @DeleteMapping("/student/{id}")
    public String delete(@PathVariable("id") Integer id) {
        studentService.deleteById(id);
        return "student is deleted";
    }
}