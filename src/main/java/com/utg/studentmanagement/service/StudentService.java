package com.utg.studentmanagement.service;

import com.utg.studentmanagement.entity.Student;
import com.utg.studentmanagement.exception.StudentNotFoundException;
import com.utg.studentmanagement.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

        private final StudentRepository repository;

        public StudentService(StudentRepository repository) {
            this.repository = repository;
        }

        public List<Student> getAllStudents() {
            return repository.findAll();
        }

        public Student getStudentById(Long id) {
            return repository.findById(id)
                    .orElseThrow(() -> new StudentNotFoundException(id));
        }

        public Student saveStudent(Student student) {
            return repository.save(student);
        }

        public void deleteStudent(Long id) {
            if (!repository.existsById(id)) {
                throw new StudentNotFoundException(id);
            }
            repository.deleteById(id);
        }
    }
