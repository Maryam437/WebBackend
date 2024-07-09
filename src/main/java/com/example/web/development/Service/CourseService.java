package com.example.web.development.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.web.development.Model.Course;
import com.example.web.development.Repository.CourseRepository;

@Service
public class CourseService {
  
    @Autowired
    private CourseRepository courseRepository;


    public List<Course> getAllCourses(){
        return courseRepository.findAll();
    }

    public Course getCourseById(Long courseId) {
    
       Optional<Course> course = courseRepository.findById(courseId);
       return course.get();

    }
    public Course createCourse(Course courses) {
        return courseRepository.save(courses);
    }

    public void deleteCourse(Long courseId) {
        
        courseRepository.deleteById(courseId);
        
    }

    public Course updateCourse(Course course){
        Course existingCourse = courseRepository.findById(course.getCourse_id()).get();
        existingCourse.setCourse_id(course.getCourse_id());
        existingCourse.setCourse_name(course.getCourse_name());
        existingCourse.setCourse_room(course.getCourse_room());
        existingCourse.setCourse_title(course.getCourse_title());
        Course updateCourse = courseRepository.save(existingCourse);
        return updateCourse;
     }

}
 