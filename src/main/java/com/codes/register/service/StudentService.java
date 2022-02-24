package com.codes.register.service;

import com.codes.register.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudent();
    public Student getByID(Integer id);
    public void deleteById(Integer id);

}
