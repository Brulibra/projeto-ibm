package br.com.projetoibm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class ProjetoIbmApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoIbmApplication.class, args);
	}

}
