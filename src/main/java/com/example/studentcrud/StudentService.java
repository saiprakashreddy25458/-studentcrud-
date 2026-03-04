package com.example.studentcrud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    // Get all students
    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    // Get student by ID
    public Optional<Student> getStudentById(Long id) {
        return repository.findById(id);
    }

    // Save student
    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    // Delete student
    public void deleteStudent(Long id) {
        repository.deleteById(id);
    }
}