package com.example.web.development.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.web.development.Model.Student;
import com.example.web.development.Repository.StudentRepository;

@Service
public class StudentService {
    
 @Autowired
 private StudentRepository studentRepository;
 public List<Student> getAllStudents(){
 return studentRepository.findAll();
 
}
 public Student updateStudent(Student student) {
    Student extingStudent = studentRepository.findById(student.getId()).get();
    extingStudent.setFirstname(student.getFirstname());
    extingStudent.setLastname(student.getLastname());
    extingStudent.setEmail(student.getEmail());
    extingStudent.setPassword(student.getPassword());
    extingStudent.setCountry(student.getCountry());
    extingStudent.setAddress(student.getAddress());
    Student updateStudent = studentRepository.save(extingStudent);
    return updateStudent;
 }

   public Student createStudent(Student student){
       return studentRepository.save(student);
}
   public void deleteStudent(Long studentId){
      studentRepository.deleteById(studentId);
   }
     } 





