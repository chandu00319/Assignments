package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
