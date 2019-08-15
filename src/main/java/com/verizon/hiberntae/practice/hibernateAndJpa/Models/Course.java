package com.verizon.hiberntae.practice.hibernateAndJpa.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Course {

	@Id
	@GeneratedValue
	private Long id;

	@Column(name = "Course_Name")
	private String name;

	protected Course() {

	}

	public void setId(Long id) {
		this.id = id;
	}

	public Course(String name) {
		super();
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
