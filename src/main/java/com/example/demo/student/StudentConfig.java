package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student yunus = new Student(
                    "Yunus",
                    "yeu@gmail.com",
                    LocalDate.of(1997, Month.JANUARY,24)
            );
            Student emre = new Student(
                    "emre",
                    "emre@gmail.com",
                    LocalDate.of(1995, Month.JANUARY,14)
            );
            repository.saveAll(
                    List.of(yunus,emre)
            );
        };
    }
}
