package com.shahensha.SpringJPAProject.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.shahensha.SpringJPAProject.entity.Person;


public interface Datarepository extends CrudRepository<Person, Integer> {

	@Query("SELECT p From Person p")
	public List<Person> findAll();
 }
