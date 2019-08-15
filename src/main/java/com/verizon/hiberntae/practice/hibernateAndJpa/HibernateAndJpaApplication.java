package com.verizon.hiberntae.practice.hibernateAndJpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.verizon.hiberntae.practice.hibernateAndJpa.Models.Course;
import com.verizon.hiberntae.practice.hibernateAndJpa.repo.CourseRepo;

@SpringBootApplication
public class HibernateAndJpaApplication implements CommandLineRunner {

	public static final Logger logger = LoggerFactory.getLogger(HibernateAndJpaApplication.class);

	@Autowired
	private CourseRepo courseRepo;

	public static void main(String[] args) {
		SpringApplication.run(HibernateAndJpaApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

		logger.info("Course ****************************");

		logger.info("Course FindById " + courseRepo.findById(100L));

		courseRepo.deleteById(101L);
		
		logger.info("Course save " + courseRepo.save(new Course("python")));

	}

}
