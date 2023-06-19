package com.tanmoy.weatherapi.repository;

import com.tanmoy.weatherapi.entity.Cities;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitiesRepository extends JpaRepository<Cities, Long> {
}
