package com.github.jessicasbatista.citiesapi.distances.service;


import com.github.jessicasbatista.citiesapi.cities.CityRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class DistanceService {

    private final CityRepository cityRepository;
    Logger log = LoggerFactory.getLogger(DistanceService.class);

    public DistanceService(final CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public Double distanceByPointsInMiles(final Long city1, final Long city2) {
        log.info("nativePostgresInMiles({}, {})", city1, city2);
        return cityRepository.distanceByPoints(city1, city2);
    }
}
