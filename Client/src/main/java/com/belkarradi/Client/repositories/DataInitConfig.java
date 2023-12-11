package com.belkarradi.Client.repositories;

import org.springframework.boot.CommandLineRunner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.belkarradi.Client.entities.Client;

@Configuration
public class DataInitConfig {

	@Bean
    public CommandLineRunner initialiserBaseH2(ClientRepository clientRepository) {
        return args -> {
            clientRepository.save(new Client(Long.parseLong("1"), "Rabab SELIMANI", Float.parseFloat("23")));
            clientRepository.save(new Client(Long.parseLong("2"), "Amal RAMI", Float.parseFloat("22")));
            clientRepository.save(new Client(Long.parseLong("3"), "Samir SAFI", Float.parseFloat("22")));
       
        
            clientRepository.save(new Client(Long.parseLong("4"), "BELKARRADI Mohammed", Float.parseFloat("22")));
};
 }
	
}