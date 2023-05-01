package com.example.demo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
@RestController
public class DemoApplication{
	private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

	@Autowired
	JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	mainController m = new mainController();

//	@GetMapping("/demo")
//	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
//		return String.format("Hello %s!", name);
//	}
//
//	@GetMapping("/")
//	public String index() {
//		return "Greetings from Spring Boot!";
//	}


//	@Override
//	public void run(String... args) throws Exception {
//		log.info("landed in run method of commandlinerunner");
//
//		// Split up the array of whole names into an array of first/last names
////		List<Object[]> splitUpNames = Arrays.asList("John Woo", "Jeff Dean", "Josh Bloch", "Josh Long").stream()
////				.map(name -> name.split(" "))
////				.collect(Collectors.toList());
////
////		// Use a Java 8 stream to print out each tuple of the list
////		splitUpNames.forEach(name -> log.info(String.format("Inserting customer record for %s %s", name[0], name[1])));
////
////		// Uses JdbcTemplate's batchUpdate operation to bulk load data
////		jdbcTemplate.batchUpdate("INSERT INTO customers(first_name, last_name) VALUES (?,?)", splitUpNames);
//
//		log.info("Querying for customer records where first_name = 'Josh':");
//		jdbcTemplate.query(
//				"SELECT euid, nickname, first_name, surname, date_of_birth FROM person WHERE first_name = ?", new Object[] { "Albert" },
//				(rs, rowNum) -> new Person(rs.getInt("euid"), rs.getString("nickname"), rs.getString("surname"), rs.getString("first_name"), rs.getString("date_of_birth"))
//		).forEach(customer -> log.info(customer.toString()));
//	}

}