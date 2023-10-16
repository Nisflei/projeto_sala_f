package com.aula.projeto_sala_f;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProjetoSalaEApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjetoSalaEApplication.class, args);
    }

    @GetMapping("/")
    public String oi(){
        return "Sala 2o. F turma Germinare Tech..!";
    }
}
