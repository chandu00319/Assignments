package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Administrator;

public interface AdministratorRepository extends JpaRepository<Administrator, Long> {

}
