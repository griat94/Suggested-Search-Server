package com.search.app;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/app")
public class SearchController {

    @GetMapping("/search")
    public List<String> getAllDestinations(){
        List<String> cities = Stream.of
                ("Winnipeg",
                "Toronto",
                "Regina",
                "Montreal",
                "Calgary",
                "Vancouver",
                "Halifax",
                "Waterloo",
                "Ottawa",
                "Edmonton",
                "Victoria",
                "St John")
                .collect(Collectors.toList());
        return cities;
    }
}
