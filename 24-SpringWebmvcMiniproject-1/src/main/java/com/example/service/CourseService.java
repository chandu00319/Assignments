package com.example.service;

import java.util.List;

import com.example.entity.Course;

public interface CourseService {

	
	public Course addCourse(Course course);
	
	public List<Course> getAllCourses();
	
	public Course getCourseById(Long id);
}
