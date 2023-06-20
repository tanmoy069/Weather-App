package com.tanmoy.weatherapi;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.tanmoy.weatherapi.dto.WeatherResponseDto;
import com.tanmoy.weatherapi.entity.Cities;
import com.tanmoy.weatherapi.repository.CitiesRepository;
import com.tanmoy.weatherapi.service.WeatherService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class WeatherApiApplicationTests {

	@Autowired
	private CitiesRepository citiesRepository;

	@Autowired
	private WeatherService weatherService;

	@Test
	void testCitiesList() {
		List<Cities> citiesList = citiesRepository.findAll();
		Assertions.assertNotEquals(0, citiesList.size());
	}

	@Test
	void testWeatherDetailsGetByLatLng() throws JsonProcessingException {
		List<Cities> citiesList = citiesRepository.findAll();
		Cities cities = citiesList.get(0);
		WeatherResponseDto responseDto = weatherService.getWeatherDetailsByLatLng(cities.getLatitude(), cities.getLongitude());
		System.out.println(responseDto);
		Assertions.assertEquals((int) responseDto.getLatitude(), (int) cities.getLatitude());
		Assertions.assertEquals((int) responseDto.getLongitude(), (int) cities.getLongitude());
	}

}
