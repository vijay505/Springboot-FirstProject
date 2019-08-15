package com.verizon.hiberntae.practice.hibernateAndJpa.repo;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.verizon.hiberntae.practice.hibernateAndJpa.Models.Course;

@Repository
@Transactional
public class CourseRepo {

	@Autowired
	private EntityManager em;

	public Course findById(Long id) {
		return em.find(Course.class, id);

	}

	public void deleteById(Long id) {

		Course c = findById(id);
		em.remove(c);
	}

	public Course save(Course course) {
		if (course.getId() == null) {
			em.persist(course);
		} else {
			em.merge(course);
		}
		return course;

	}
}
