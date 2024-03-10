package com.limoncitoscompany.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.limoncitoscompany.springboot.model.Product;
import com.limoncitoscompany.springboot.repository.ProductRepository;

@SpringBootApplication
public class SpringbootApplication  implements CommandLineRunner {
	@Autowired
	private ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

	public void run(String... args) throws Exception{
		productRepository.save(new Product("Television", "Electrinics"));
		productRepository.save(new Product("Television", "Electrinics"));
		productRepository.save(new Product("Television", "Electrinics"));
		productRepository.save(new Product("Television", "Electrinics"));
		productRepository.save(new Product("Television", "Electrinics"));
	}
}

