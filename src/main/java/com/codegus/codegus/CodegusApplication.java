package com.codegus.codegus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing // para auditoría, habilita generar automáticamente las fechas
public class CodegusApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodegusApplication.class, args);
	}

}
