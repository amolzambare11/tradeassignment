package com.db.tradestorage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.db")
public class TradestorageApplication {

	public static void main(String[] args) {

		SpringApplication.run(TradestorageApplication.class, args);
	}

}
