package com.main.service;



import java.util.List;

import com.main.model.Student;


public interface LomServiceI {

	void addData(Student st);

	public List<Student> getData();

	Student getSingleData(int rollno);

	void updateData(Student stu, int rollno);

	List<Student> updateList(List<Student> stu);

	void deleteData(int rollno);

}
