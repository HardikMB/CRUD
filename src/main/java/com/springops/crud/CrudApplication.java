package com.springops.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudApplication {

	public static void main(String[] args) {
		System.setProperty("server.servlet.context-path", "/crudApp1");
		SpringApplication.run(CrudApplication.class, args);
	}

}
