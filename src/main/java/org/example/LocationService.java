package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LocationService {

    public static void main(String[] args) {
        SpringApplication.run(LocationService.class, args);
    }

    @GetMapping("/location")
    public Location getLocation(@RequestParam String city) {
        Location location = new Location(city, 55.75, 37.61); // пример данных
        return location;
    }
}
