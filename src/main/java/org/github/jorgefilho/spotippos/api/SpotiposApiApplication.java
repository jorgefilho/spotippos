package org.github.jorgefilho.spotippos.api;

import org.github.jorgefilho.spotippos.api.service.InputDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpotiposApiApplication implements CommandLineRunner {

	@Autowired
	private InputDataService inputDataService;

	public static void main(String[] args) {
		SpringApplication.run(SpotiposApiApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		this.inputDataService.load();
	}
}