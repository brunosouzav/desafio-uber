package com.uber.desafio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uber.desafio.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>{

}
