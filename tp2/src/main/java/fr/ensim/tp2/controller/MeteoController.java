package fr.ensim.tp2.controller;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import fr.ensim.tp2.model.AdresseEtalab;
import fr.ensim.tp2.model.AdresseEtalabRoot;
import fr.ensim.tp2.model.InstantMeasurePojo;
import fr.ensim.tp2.model.InstantMeasurePojo.InstantMeasureRoot;

@Controller
public class MeteoController {
        @PostMapping("/meteo")
        public String showMeteo(@RequestParam(value = "address", defaultValue = "Le Mans") String addressPOST,
                        Model model) {
                RestTemplate restTemplate = new RestTemplate();

                String baseUrlEtalab = "https://api-adresse.data.gouv.fr/search/?q=";
                String queryUrlEtalab = baseUrlEtalab + addressPOST + "&limit=1";

                AdresseEtalabRoot adresseRestTemplate = restTemplate.getForObject(queryUrlEtalab,
                                AdresseEtalabRoot.class);
                AdresseEtalab adresseEtalabRestTemplate = restTemplate.getForObject(queryUrlEtalab,
                                AdresseEtalab.class);

                String queryCoordinates = adresseRestTemplate.getFeatures().get(0).getGeometry().getCoordinates()[1]
                                + "," + adresseRestTemplate.getFeatures().get(0).getGeometry().getCoordinates()[0];

                String TOKEN = "7e8b559bf6bc23298e6db076cab9cd50abd8a4945d70d6cad630d29b5b92d7c5";

                String baseUrlMeteoConcept = "https://api.meteo-concept.com/api/";
                String queryUrlInstantMeasure = baseUrlMeteoConcept + "observations/around?token=" + TOKEN + "&latlng="
                                + queryCoordinates;

                // getForObject() ne fonctionne pas avec une liste d'objets. Ne fonctionne pas :
                // ArrayList<InstantMeasureRoot> instantMeasureList =
                // restTemplate.getForObject(queryUrlInstantMeasure,
                // ArrayList.class);

                // Ceci fonctionne :
                ResponseEntity<InstantMeasureRoot[]> response = restTemplate
                                .getForEntity(queryUrlInstantMeasure, InstantMeasureRoot[].class);
                InstantMeasureRoot[] instantMeasures = response.getBody();

                model.addAttribute("adresseP", addressPOST);
                model.addAttribute("adresseEtalab", adresseRestTemplate);
                model.addAttribute("adresseEtalab2", adresseEtalabRestTemplate);
                model.addAttribute("instantMeasure",
                                instantMeasures[0].getObservation().getOutside_temperature().getValue());
                // model.addAttribute("dailyForecast", dailyForecast);

                return "meteo";
        }
}