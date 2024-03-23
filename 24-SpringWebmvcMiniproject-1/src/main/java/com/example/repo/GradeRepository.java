package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Grade;

public interface GradeRepository  extends JpaRepository<Grade, Long>{

	public Grade findByEnrollmentId(Long enrollmentId);

}
