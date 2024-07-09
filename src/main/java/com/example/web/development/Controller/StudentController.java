package com.example.web.development.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.web.development.Model.Student;
import com.example.web.development.Service.StudentService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/student")
public class StudentController {
 
  @Autowired
  private StudentService studentService;

  @GetMapping("/all")
  public ResponseEntity<List<Student>> getAllStudent(){

     List<Student> students = studentService.getAllStudents();
     return new ResponseEntity<>(students,HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable("id") Long studentId, @RequestBody Student student) {
    student.setId(studentId);
    Student studentUpdate = studentService.updateStudent(student);
    return new ResponseEntity<>(studentUpdate,HttpStatus.CREATED);

        }
      
        @PostMapping("/create")
        public Student createStudent(@RequestBody Student student){
           return studentService.createStudent(student);
        }
        @DeleteMapping("/delete/{id}")
        public ResponseEntity<String> deleteStudent(@PathVariable("id") Long studentId){
          studentService.deleteStudent(studentId);
          return new ResponseEntity<String>("Student deleted sucessfully", HttpStatus.OK);
        }

    }

  




