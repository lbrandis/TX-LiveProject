package com.txmanager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class TransactionManagerApplication {
	 
	public static void main(String[] args) {
		SpringApplication.run(TransactionManagerApplication.class, args);
	}
	
	/*
	@Bean
	public CommandLineRunner demo(TransactionRepository repository) {
		return (args) -> { // save a few customers log.info("Before Saving");
			System.out.println("Before Saving");

			repository.save(new Transaction("Credit", new Date(), 12345, "USD", 1000.00, "Amazon", "Amazon Logo"));
			repository.save(new Transaction("Debit", new Date(), 23456, "USD", 2500.00, "Apple", "Apple Logo"));
			repository.save(new Transaction("Debit", new Date(), 34567, "USD", 3000.00, "Lexus", "Lexus Logo"));
			repository.save(new Transaction("Credit", new Date(), 45678, "USD", 4000.00, "BMW", "BMW Logo"));
			repository.save(new Transaction("Credit", new Date(), 56789, "USD", 5000.00, "MSG", "MSG Logo"));

			
		};
		
	}
	*/

}
