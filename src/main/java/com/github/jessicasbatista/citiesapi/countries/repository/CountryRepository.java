package com.github.jessicasbatista.citiesapi.countries.repository;

import com.github.jessicasbatista.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
