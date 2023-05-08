package com.isha.batch4119.spring.example.spring.boot.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.isha.batch4119.spring.example.spring.boot.example.model.Employee;

@Repository
	public interface EmployeeRepository extends JpaRepository<Employee,Long>{

	List<Employee> findAll();

	

	}

