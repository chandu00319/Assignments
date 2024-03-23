package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Enrollment;
import com.example.repo.EnrollmentRepository;
@Service
public class IEnrollmentService implements EnrollmentService {

	@Autowired
	 private EnrollmentRepository enrollmentRepository;
	@Autowired
	private StudentService studentservice;
	@Autowired
	private CourseService courseService;
	 public void enrollStudentInCourse(Long studentId, Long courseId) {
	 Enrollment enrollment = new Enrollment();
	 enrollment.setStudent(studentservice.getStudentById(studentId));
	 enrollment.setCourse(courseService.getCourseById(courseId));
	 enrollmentRepository.save(enrollment);
	 }
	
	 }

