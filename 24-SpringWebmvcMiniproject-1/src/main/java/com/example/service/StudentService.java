package com.example.service;

import java.util.List;

import com.example.entity.Student;

public interface StudentService {

	
	public boolean addStudent(Student student);
	
	public List<Student> getAllStudents();
	
	public Student getStudentById(Long id);
}
