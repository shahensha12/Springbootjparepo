package com.shahensha.SpringJPAProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shahensha.SpringJPAProject.dao.Datarepository;
import com.shahensha.SpringJPAProject.entity.Person;

@RestController
public class JPAController {

	@Autowired
	private Datarepository datarepo;
	
		
		@RequestMapping("/")
		public String home(){
					
			return "Jpaform.jsp";
		}
		
		@RequestMapping("adddata")
		public String addData(Person person) {
			
			datarepo.save(person);
			return "Jpaform.jsp";
		}
		
}
