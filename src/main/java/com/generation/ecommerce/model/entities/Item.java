package com.generation.ecommerce.model.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Item 
{		
		@Id
		@GeneratedValue (strategy = GenerationType.IDENTITY)
		private Integer id;
		private String name;
		private String description;
		@Column(name="price")
		private double cost;
}
