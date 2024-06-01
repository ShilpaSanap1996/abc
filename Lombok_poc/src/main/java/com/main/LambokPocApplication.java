package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.main.model.Student;

@SpringBootApplication
public class LambokPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(LambokPocApplication.class, args);
//		
//		Student stu=new Student();
//		stu.setRollno(11);
//		stu.setName("shilpa");
//		stu.setAddress("pune");
//		
//		System.out.println(stu.getRollno());
//		System.out.println(stu.getName());
//		System.out.println(stu.getAddress());
	}

}
