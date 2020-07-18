package com.domaci.prvi;

import com.domaci.prvi.services.LdapService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PrviApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrviApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(LdapService ldapService) {
        return args -> {
            ldapService.connect();
        };
    }
}
