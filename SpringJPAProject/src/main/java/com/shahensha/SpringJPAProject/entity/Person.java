package com.shahensha.SpringJPAProject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="person")
public class Person {
	
	@Id
	@SequenceGenerator(name="start",sequenceName="Per_pid_Seq")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="start")
	@Column(unique=true,nullable=false,precision=1)
	private Integer pid;
	private String name;
	public Person() {
		super();
	}
	public Person(Integer pid, String name) {
		super();
		this.pid = pid;
		this.name = name;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + "]";
	}
	
}
