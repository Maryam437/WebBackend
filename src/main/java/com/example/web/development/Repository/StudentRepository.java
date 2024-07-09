package com.example.web.development.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.web.development.Model.Student;

@Repository
public interface StudentRepository extends  JpaRepository<Student, Long> {
  @Query("SELECT s FROM Student s")
    List<Student> getAllStudent();
}
    
    

