package com.tanmoy.weatherapi.repository;

import com.tanmoy.weatherapi.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}
