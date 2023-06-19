package com.tanmoy.weatherapi;

import com.tanmoy.weatherapi.entity.Cities;
import com.tanmoy.weatherapi.repository.CitiesRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class WeatherApiApplicationTests {

	@Autowired
	private CitiesRepository citiesRepository;

	@Test
	void testCitiesList() {
		List<Cities> citiesList = citiesRepository.findAll();
		Assertions.assertNotEquals(0, citiesList.size());
	}

}
