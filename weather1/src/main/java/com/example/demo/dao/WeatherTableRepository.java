package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository; //

import com.example.demo.entity.WeatherTable;

public interface WeatherTableRepository extends CrudRepository<WeatherTable, String> {

}
