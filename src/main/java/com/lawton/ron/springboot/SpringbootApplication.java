package com.lawton.ron.springboot;
/**
 *	Use http://localhost:8080/h2-console/ to view database
 *  Use http://localhost:8080/books to view books
 *  Use http://localhost:8080/authors to view books
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}
}
