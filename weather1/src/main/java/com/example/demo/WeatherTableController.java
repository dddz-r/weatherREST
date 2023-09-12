package com.example.demo;

import java.io.Console;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.WeatherTableRepository;
import com.example.demo.entity.WeatherTable;

@RestController
public class WeatherTableController {

	private WeatherTableRepository repository;

	//스프링부트가 컨트롤러 만들때 레파지토리라는 객체만들어 파라미터로 전달
	public WeatherTableController(WeatherTableRepository repository) {
		super();
		this.repository = repository;
	}
	
	@GetMapping("/weather/{id}")
	public WeatherTable getWeatherTable (@PathVariable String id) {
		return repository.findById(id).orElseThrow(null);
	}
	
	@PostMapping("/weather")
	public WeatherTable postWeatherTable (@RequestBody WeatherTable weather) {
		System.out.println("getpost log :" + weather);
		return repository.save(weather);
	}
	
	@PutMapping("/weather/{id}")
	public WeatherTable putWeatherTable (@PathVariable String id, @RequestBody WeatherTable weather) {
		return repository.save(weather);
	}
	
	@PatchMapping("/weather/{id}")
	public WeatherTable patchWeatherTable (@PathVariable String id, @RequestBody WeatherTable weather) {
		return repository.save(weather);
	}
	
	@DeleteMapping("/weather/{id}")
	public void deleteWeatherTable (@PathVariable String id) {
		repository.deleteById(id);
	}
	
	@GetMapping("/weather/list")
	public List<WeatherTable> getWeatherTableList () {
		List<WeatherTable> weatherList = (List<WeatherTable>) repository.findAll();
		for(WeatherTable weather :  weatherList){
			System.out.println("getlist log :" + weather.getId());
			
		}
		
		System.out.println("getlist log :" + weatherList);
		return (List<WeatherTable>) repository.findAll();
		
	}
	
	
}
