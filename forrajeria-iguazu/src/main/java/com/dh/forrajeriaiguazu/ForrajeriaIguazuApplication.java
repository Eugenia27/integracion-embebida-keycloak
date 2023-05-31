package com.dh.forrajeriaiguazu;

import com.dh.forrajeriaiguazu.model.Product;
import com.dh.forrajeriaiguazu.repository.IProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ForrajeriaIguazuApplication {

	public static void main(String[] args) {
		SpringApplication.run(ForrajeriaIguazuApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(IProductRepository productRepository) {
		return (args) -> {
			if (!productRepository.findAll().isEmpty()) {
				return;
			}

			productRepository.save(new Product(1L, "Alimento para perros", 10.50, 25.99));
			productRepository.save(new Product(2L, "Alimento para gatos", 5.50, 15.99));
			productRepository.save(new Product(3L, "Alimento para peces", 2.20, 7.99));
			productRepository.save(new Product(4L, "Heno de alfalfa", 5.00, 12.99));
			productRepository.save(new Product(5L, "Comida para aves", 1.50, 6.99));
			productRepository.save(new Product(6L, "Arena para gatos", 15.00, 8.99));
			productRepository.save(new Product(7L, "Pellets para conejos", 2.00, 10.99));
			productRepository.save(new Product(8L, "Pasto para hamsters", 1.00, 4.99));
			productRepository.save(new Product(9L, "Comida para tortugas", 0.50, 7.99));
			productRepository.save(new Product(10L, "Heno para caballos", 10.00, 22.99));
			productRepository.save(new Product(11L, "Semillas de girasol", 0.25, 2.99));
			productRepository.save(new Product(12L, "Alfalfa molida", 2.50, 8.99));
			productRepository.save(new Product(13L, "Huesos de carnaza", 0.20, 1.99));
			productRepository.save(new Product(14L, "Hojas de eucalipto", 0.50, 4.99));
			productRepository.save(new Product(15L, "Lecho de madera para roedores", 5.00, 9.99));

		};
	}


}
