package com.uber.desafio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uber.desafio.entities.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long>{

}
