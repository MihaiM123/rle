package com.example.rle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RleApplication {

	public static void main(String[] args) {

		SpringApplication.run(RleApplication.class, args);

		RunLengthEncoding runLengthEncoding = new RunLengthEncoding();

		String result = runLengthEncoding.encode("aaaabbbccd");

		System.out.println(result);
	}

}
