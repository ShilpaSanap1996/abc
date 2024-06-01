package com.main.repository;

import org.springframework.data.repository.CrudRepository;

import com.main.model.Student;

public interface LomRepository extends CrudRepository<Student, Integer>{

}
