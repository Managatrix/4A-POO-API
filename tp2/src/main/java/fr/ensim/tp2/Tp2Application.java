package fr.ensim.tp2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import fr.ensim.tp2.model.AdresseEtalab;

@SpringBootApplication
public class Tp2Application {

	public static void main(String[] args) {
		SpringApplication.run(Tp2Application.class, args);
	}

	// @Bean
	// public RestTemplate restTemplate(RestTemplateBuilder builder) {
	// 	return builder.build();
	// }

	// @Bean
	// public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
	// 	return args -> {
	// 		AdresseEtalab adresseEtalab = restTemplate.getForObject(
	// 				"https://api-adresse.data.gouv.fr/search/?q=90%20Rue%20Nationale%2072000%20Le%20Mans&type=housenumber", AdresseEtalab.class);
	// 	};
	// }

}
