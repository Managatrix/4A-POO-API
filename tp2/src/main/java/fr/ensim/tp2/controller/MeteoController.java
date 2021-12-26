package fr.ensim.tp2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import fr.ensim.tp2.model.AdresseEtalab;
import fr.ensim.tp2.model.Root;

@Controller
public class MeteoController {
        @PostMapping("/meteo")
        public String showMeteo(@RequestParam(value = "address", defaultValue = "Le Mans") String addressPOST,
                        Model model) {
                model.addAttribute("adresseP", addressPOST);

                RestTemplate restTemplate = new RestTemplate();
                String baseUrlEtalab = "https://api-adresse.data.gouv.fr/search/?q=";
                String queryUrlEtalab = baseUrlEtalab + addressPOST + "&limit=1";

                Root adresseRestTemplate = restTemplate.getForObject(queryUrlEtalab, Root.class);

                model.addAttribute("adresseEtalab", adresseRestTemplate);

                return "meteo";
        }
}