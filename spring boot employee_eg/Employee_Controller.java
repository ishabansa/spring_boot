package com.isha.batch4119.spring.example.spring.boot.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isha.batch4119.spring.example.spring.boot.example.model.Employee;
import com.isha.batch4119.spring.example.spring.boot.example.repository.EmployeeRepository;


@RestController
@RequestMapping("/student")
public class Employee_Controller {
	@Autowired
EmployeeRepository sr;
@RequestMapping("/details")
public List<Employee> getStudents(){
	return sr.findAll();
}
}