package com.foodexpress.alimento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AlimentoApplication{ //implements CommandLineRunner{
//	@Autowired
//	private CustomerService customerService;
//	
	public static void main(String[] args) {
		SpringApplication.run(AlimentoApplication.class, args);
		
	}
//
//	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		Customer customer=new Customer("Umar","Khan","khanumar@gmail.com","Shahjahanabad","8754593203","Umar2310");
//		customerService.saveCustomer(customer);
//	}

}
