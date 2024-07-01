package br.com.dicasdeumdev.api3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import domain.User;





@SpringBootApplication
public class Api3Application {

	public static void main(String[] args) {
		SpringApplication.run(Api3Application.class, args);
		
		//User user = new User(1,"valdir","valdir@email.com","123");
		//User user = new User();
		//User user = new User(1,"","","");
		//User user = new User();
		
	}

}
