package com.example.repository;

import com.example.repository.model.Product;
import com.example.repository.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RepositoryApplication implements CommandLineRunner {

    private ProductRepository productRepository;

    @Autowired
    public void productRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(RepositoryApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Product product1 = new Product();
        product1.setName("Tester Product");
        product1.setDescription("This is a tester product");
        product1.setCategory("TEST");
        product1.setType("GENERAL");
        product1.setPrice(0.0);

        productRepository.save(product1);

        Product product2 = new Product();
        product2.setName("Test product2");
        product2.setDescription("xxxxxx");
        product2.setCategory("xxxxxx");
        product2.setType("xxxxxxx");
        product2.setPrice(0.0);

        productRepository.save(product2);

        productRepository.delete(product2);


    }
}
