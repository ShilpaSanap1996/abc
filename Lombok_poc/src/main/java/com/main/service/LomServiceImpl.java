package com.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.model.Student;
import com.main.repository.LomRepository;
@Service
public class LomServiceImpl implements LomServiceI{

	@Autowired
	LomRepository repo;
	@Override
	public void addData(Student st) {
		
		repo.save(st);
	}
	@Override
	public List<Student> getData() {
		
		return (List<Student>) repo.findAll();
	}
	@Override
	public Student getSingleData(int rollno) {
		
		Optional<Student>op= repo.findById(rollno);
		 return op.get();
	}
	@Override
	public void updateData(Student stu, int rollno) {
		repo.save(stu);
		
	}
	@Override
	public List<Student> updateList(List<Student> stu ) {
					repo.saveAll(stu);
		return (List<Student>) repo.findAll();
	}
	@Override
	public void deleteData(int rollno) {
		repo.deleteById(rollno);
		
	}

}
