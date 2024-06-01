package com.main.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Student {

	@Id
	private int rollno;
	private String name;
	private String address;
	
}
