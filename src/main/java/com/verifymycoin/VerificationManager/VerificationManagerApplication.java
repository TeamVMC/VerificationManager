package com.verifymycoin.VerificationManager;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VerificationManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(VerificationManagerApplication.class, args);
	}

}
