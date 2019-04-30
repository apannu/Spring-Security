package com.example.spring.security.service;

import org.springframework.stereotype.Service;

import com.example.spring.security.domain.Student;

@Service
public class StudentService {
	
	public String getStudentRecords()
	{
		Student student = new Student();
		student.setId("1");
		student.setName("Anirudh");
		
		return student.toString();
	}

}
