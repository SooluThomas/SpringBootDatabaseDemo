package com.example.databaseDemo;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import  org.slf4j.Logger;

@SpringBootApplication
public class DatabaseDemoApplication implements CommandLineRunner{

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	StudentJpaRepository repository;
	public static void main(String[] args) {
		SpringApplication.run(DatabaseDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("\nInserting 101 -> {}", repository.insert(new Student(101, "Soonu")));
		logger.info("\nInserting 102 -> {}", repository.insert(new Student(102, "Soolu")));
		logger.info("\nInserting 103 -> {}", repository.insert(new Student(103, "Sru")));

		logger.info("\nFound Student 101 -> {}", repository.findById(101));

		logger.info("\nUpdating 103 -> {}", repository.update(new Student(103,"Sruthi")));

        repository.remove(101);
		logger.info("\nDeleting 101");
	}
}

