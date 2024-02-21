package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.service.IUserService;

@SpringBootApplication(scanBasePackages={"com.example.repository","com.example.service"})
public class MyAppApplication implements CommandLineRunner{

	private static Logger LOG = LoggerFactory.getLogger(MyAppApplication.class);
	@Autowired
	private IUserService service;
	public static void main(String[] args) {
		SpringApplication.run(MyAppApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		service.register("Mateo");
	}

}
