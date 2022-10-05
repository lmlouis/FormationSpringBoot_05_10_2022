package com.lmlouis.projetSpringBoot.config;

import com.lmlouis.projetSpringBoot.EntitiesOrModel.Student;
import com.lmlouis.projetSpringBoot.IdaoRipository.StudentRipository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRipository repository){
        return args -> {
            Student natacha = new Student(
                    "Natacha",
                    "natacha@gmail.com",
                    LocalDate.of(2002, Month.JANUARY, 5)
            );

            Student pierre = new Student(
                    "pierre",
                    "pierre@gmail.com",
                    LocalDate.of(1999, Month.DECEMBER, 10)
            );

            repository.saveAll(
                    List.of(natacha, pierre)
            );

        };
    }
}
