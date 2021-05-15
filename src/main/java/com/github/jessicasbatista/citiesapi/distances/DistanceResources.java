package com.github.jessicasbatista.citiesapi.distances;


import com.github.jessicasbatista.citiesapi.distances.service.DistanceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/distances")
public class DistanceResources {

    private final DistanceService service;
    Logger log = LoggerFactory.getLogger(DistanceResources.class);

    public DistanceResources(DistanceService service) {
        this.service = service;
    }

    @GetMapping("/by-points")
    public ResponseEntity byPoints(@RequestParam(name = "from") final Long city1,
                                   @RequestParam(name = "to") final Long city2) {
        log.info("byPoints");
        return ResponseEntity.ok().body(service.distanceByPointsInMiles(city1, city2));
    }
}