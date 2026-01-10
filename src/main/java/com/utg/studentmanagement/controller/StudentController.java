//package com.utg.studentmanagement.controller;
//
//import com.utg.studentmanagement.entity.Student;
//import com.utg.studentmanagement.repository.StudentRepository;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/students")
//public class StudentController {
//
//        private final StudentRepository studentRepository;
//
//        public StudentController(StudentRepository studentRepository) {
//            this.studentRepository = studentRepository;
//        }
//
//        @PostMapping
//        public Student addStudent(@RequestBody Student student) {
//            System.out.println("POST /students CALLED");
//            System.out.println(student.getName());
//            System.out.println(student.getEmail());
//            System.out.println(student.getCourse());
//            return studentRepository.save(student);
//        }
//
//        @GetMapping
//        public List<Student> getAllStudents() {
//            return studentRepository.findAll();
//        }



//

package com.utg.studentmanagement.controller;

import com.utg.studentmanagement.entity.Student;
import com.utg.studentmanagement.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
    }
}

