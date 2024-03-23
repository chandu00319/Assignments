package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Grade;
import com.example.repo.GradeRepository;
@Service
public class IGradeService implements GradeService {

	@Autowired
	 private GradeRepository gradeRepository;
	
	 public void assignGradeToStudent(Long enrollmentId, Double grade) {
	 // Add additional logic if needed
	 // For example, check if the enrollment exists
	 // Then, assign the grade
	 Grade existingGrade = gradeRepository.findByEnrollmentId(enrollmentId);
	 if (existingGrade != null) {
	 existingGrade.setGrade(grade);
	 gradeRepository.save(existingGrade);
	 } else {
	 // Handle error if the enrollment does not exist
	 }
	

}
}