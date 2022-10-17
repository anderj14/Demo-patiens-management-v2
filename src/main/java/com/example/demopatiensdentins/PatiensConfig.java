package com.example.demopatiensdentins;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class PatiensConfig {

    @Bean
    CommandLineRunner commandLineRunner(PatiensRepository patiensRepository){
        return args -> {
            Patiens  Ander = new Patiens(
                    "Ander",
                    "Frias",
                    LocalDate.of(2000, Month.JULY, 14),
                    4024596L,
                    "M",
                    1.76,
                    170.5,
                    "Flu",
                    "2 capsule per day",
                    "This patiens have this disease since 12 years ago",
                    "Sinusitis",
                    "winazord 2, capsule per day when he have flu",
                    LocalDate.of(2022, Month.DECEMBER, 17)
            );
            patiensRepository.saveAll(List.of(Ander));
        };
    }
}
