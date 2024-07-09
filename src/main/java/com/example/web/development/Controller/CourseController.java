package com.example.web.development.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.web.development.Model.Course;
import com.example.web.development.Service.CourseService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@CrossOrigin("*")
@RequestMapping("/api/course")
public class CourseController{

   @Autowired
    private CourseService courseService;
    @GetMapping("/all")
    public ResponseEntity<List<Course>> getAllCourse() {

        List<Course> courses = courseService.getAllCourses();
        return new ResponseEntity<>(courses,HttpStatus.OK);
    }

    @GetMapping("/coursebyid/{id}")
     public ResponseEntity<Course> getCourseById(@PathVariable("id") Long courseId){
        Course course = courseService.getCourseById(courseId);
        return new ResponseEntity<>(course,HttpStatus.OK);
     }
    
     @PostMapping("/addcourse")
    public ResponseEntity<Course> createCourse(@RequestBody Course courses) {
        try {
            Course savedCourse = courseService.createCourse(courses);
            return new ResponseEntity<>(savedCourse, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

      @DeleteMapping("/delete/{id}")
       public ResponseEntity<String> deleteCourse(@PathVariable("id") Long courseId){
        courseService.deleteCourse(courseId);
        return new ResponseEntity<String>("Course Successfull deleted",HttpStatus.OK);
     }
     @PutMapping("/update/{id}")
     public ResponseEntity<Course> getCourse(@PathVariable ("id")Long courseId) {
         Course course = courseService.getCourseById(courseId);
         return new ResponseEntity<>(course, HttpStatus.OK);
     }

    }

