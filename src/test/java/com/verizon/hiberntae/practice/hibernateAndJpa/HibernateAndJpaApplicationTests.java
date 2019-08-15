package com.verizon.hiberntae.practice.hibernateAndJpa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.verizon.hiberntae.practice.hibernateAndJpa.Models.Course;
import com.verizon.hiberntae.practice.hibernateAndJpa.repo.CourseRepo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HibernateAndJpaApplicationTests {

	public static final Logger logger = LoggerFactory.getLogger(HibernateAndJpaApplicationTests.class);

	@Autowired
	private CourseRepo courseRepo;

	@Test
	public void findById_Basic() {

		Course course = courseRepo.findById(100L);

		assertEquals("Hibernate", course.getName());
	}
	
	@Test
	@DirtiesContext
	public void deleteById_Basic() {

		courseRepo.deleteById(101L);

		assertNull(courseRepo.findById(100L));
	}
	

}
