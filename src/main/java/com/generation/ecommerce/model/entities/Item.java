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
import lombok.ToString;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
public class Item 
{		
		@Id
		@GeneratedValue (strategy = GenerationType.IDENTITY)
		private Integer id;
		private String name;
		private String description;
		@Column(name="price")
		private double cost;
		
		@Override
		public int hashCode()
		{
			return id;
		}
		
		@Override
		public boolean equals(Object o)
		{	//consideriamo un item uguale a un altro oggetto quando sono dello stesso tipo (Item) e hanno lo stesso HashCode
			return o instanceof Item && ((Item) o ).hashCode()==hashCode();
		}
}
