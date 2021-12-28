package fr.ensim.tp2.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import fr.ensim.tp2.model.AdresseEtalabRoot;
import fr.ensim.tp2.model.DailyForecastPojo.DailyForecastRoot;
import fr.ensim.tp2.model.InstantMeasurePojo.InstantMeasureRoot;

@Controller
public class MeteoController {
        @PostMapping("/meteo")
        public String showMeteo(@RequestParam(value = "address", defaultValue = "Le Mans") String addressPOST,
                        Model model) throws FileNotFoundException {
                HashMap<Integer, String> WEATHER_CODES = new HashMap<>();
                writeWeatherCodesHashMap(WEATHER_CODES,
                                new File("src/main/resources/static/weatherCodes.txt"));
                RestTemplate restTemplate = new RestTemplate();

                String baseUrlEtalab = "https://api-adresse.data.gouv.fr/search/?q=";
                String queryUrlEtalab = baseUrlEtalab + addressPOST + "&limit=1";

                AdresseEtalabRoot adresseRestTemplate = restTemplate.getForObject(queryUrlEtalab,
                                AdresseEtalabRoot.class);

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
                InstantMeasureRoot[] instantMeasures = restTemplate
                                .getForEntity(queryUrlInstantMeasure, InstantMeasureRoot[].class).getBody();

                ArrayList<DailyForecastRoot> dailyForecastList = new ArrayList<>();
                for (int i = 0; i < 8; i++) {
                        String queryUrlDailyForecast = baseUrlMeteoConcept + "forecast/daily/" + i + "?token=" + TOKEN
                                        + "&latlng=" + queryCoordinates;

                        DailyForecastRoot dailyForecast = restTemplate.getForObject(queryUrlDailyForecast,
                                        DailyForecastRoot.class);
                        dailyForecastList.add(dailyForecast);
                }

                model.addAttribute("adresseP", addressPOST);
                model.addAttribute("adresseEtalab", adresseRestTemplate);
                model.addAttribute("instantMeasure", instantMeasures[0]);
                model.addAttribute("dailyForecast", dailyForecastList);
                model.addAttribute("WEATHER_CODES", WEATHER_CODES);

                return "meteo";
        }

        void writeWeatherCodesHashMap(Map<Integer, String> map, File csvDoc) throws FileNotFoundException {
                try (Scanner scanner = new Scanner(csvDoc)) {
                        while (scanner.hasNextLine()) {
                                String line = scanner.nextLine();
                                String[] lineParts = line.split("\t");
                                map.put(Integer.parseInt(lineParts[0]), lineParts[1]);
                        }
                }
        }
}