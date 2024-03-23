package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Enrollment;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {

}
