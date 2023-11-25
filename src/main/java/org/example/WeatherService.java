package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WeatherService {

    public static void main(String[] args) {
        SpringApplication.run(WeatherService.class, args);
    }

    @GetMapping("/weather")
    public Weather getWeather(@RequestParam double latitude, @RequestParam double longitude) {
        Weather weather = new Weather("Sunny", 25); // пример данных
        return weather;
    }
}


