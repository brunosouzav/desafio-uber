package com.uber.desafio.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Restaurant {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	@OneToOne
	private Andress andress;
	
	@OneToOne
	private Coordinate coodinates;
	
	private Double rating;
	
	private String phone;
	
	private String img; 
	
	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category category;
	
	@OneToOne
	private BusinessHours businessHours;
	
}
