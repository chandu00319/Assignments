package com.example.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Student;
import com.example.repo.StudentRepository;

import jakarta.persistence.EntityNotFoundException;
@Service
public class IStudentService implements StudentService {

	
	@Autowired
	 private StudentRepository studentRepository;
	
	@Override
	public boolean addStudent(Student student) {
		
		
	Student save = studentRepository.save(student);
	
	return save.getId()!=null;
	}

	@Override
	public List<Student> getAllStudents() {
	 return studentRepository.findAll();
	}

	@Override
	public Student getStudentById(Long id) {
	
		return studentRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Student not found with id: " +
				id));

		
	}

}
