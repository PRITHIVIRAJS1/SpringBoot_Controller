package com.kgisl.sb102;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@SpringBootApplication
@EnableAspectJAutoProxy

public class Sb102Application {

	public static void main(String[] args) {
		SpringApplication.run(Sb102Application.class, args);
	}

}

