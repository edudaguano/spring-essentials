package br.com.emd.essentials;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"br.com.emd.essentials.model"})  
public class EssentialsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EssentialsApplication.class, args);
	}

}
