package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.main.model.Student;
import com.main.service.LomServiceI;

@RestController
public class LomController {
	
	@Autowired
	LomServiceI lom;
	@PostMapping("/add")
	public ResponseEntity<String> response(@RequestBody Student st)
	{
		lom.addData(st);
		return new ResponseEntity<String>(HttpStatus.CREATED);
	}
	
	@GetMapping("/get")
	public ResponseEntity<List<Student>> getData()
	{
		List<Student> list=lom.getData();
		return new ResponseEntity<>(list,HttpStatus.ACCEPTED) ;
	}
	
	@GetMapping("/getSingle/{rollno}")
	public ResponseEntity<Student> single(@PathVariable int rollno)
	{
				Student stu=lom.getSingleData(rollno);
		return new ResponseEntity<Student>(stu,HttpStatus.OK);
		
	}
	@PutMapping("/update/{rollno}")
	public ResponseEntity<String> upd(@RequestBody Student stu,@PathVariable int rollno)
	{
				lom.updateData(stu,rollno);
		return new ResponseEntity<String>(HttpStatus.ACCEPTED);
	}
	@PutMapping("/listdata")
	public ResponseEntity<List<Student>> updateData(@RequestBody List<Student> stu)
	{
		List<Student> slist=lom.updateList(stu);
		return new ResponseEntity<List<Student>>(slist,HttpStatus.OK);
	}
	@DeleteMapping("/delete/{rollno}")
	public ResponseEntity<String> deleteData(@PathVariable int rollno)
	{
			lom.deleteData(rollno);
			return new ResponseEntity<String>("deleted",HttpStatus.OK);
	}
}
