package com.codes.register.service;

import com.codes.register.model.Student;
import com.codes.register.respository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Student getByID(Integer id) {
        return studentRepository.findById(id).get();
    }
    @Override
    public void deleteById(Integer id) {
         studentRepository.deleteById(id);
    }


}
