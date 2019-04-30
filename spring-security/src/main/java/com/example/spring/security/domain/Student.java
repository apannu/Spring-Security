package com.example.spring.security.domain;

import lombok.Data;

@Data
public class Student {

	String id;
	String name;

	@Override
	public String toString() {
		return "Student [id: " + id + ", name: " + name + "]";
	}
}
