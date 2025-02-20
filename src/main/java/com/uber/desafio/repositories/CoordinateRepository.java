package com.uber.desafio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uber.desafio.entities.Coordinate;

public interface CoordinateRepository extends JpaRepository<Coordinate, Long>{

}
