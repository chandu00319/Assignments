package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Course;
import com.example.repo.CourseRepository;

import jakarta.persistence.EntityNotFoundException;
@Service
public class ICourseService implements CourseService {

	 @Autowired
	 private CourseRepository courseRepository;
	 
	 
	 public Course addCourse(Course course) {
	 // Add additional logic if needed
	 return courseRepository.save(course);
	 }
	 public List<Course> getAllCourses() {
	 return courseRepository.findAll();
	 }
	 public Course getCourseById(Long id) {
	 return courseRepository.findById(id)
	 .orElseThrow(() -> new EntityNotFoundException("Course not found with id: " +
	id));
	 }


}
