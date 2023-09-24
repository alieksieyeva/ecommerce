package com.generation.ecommerce.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.ecommerce.model.entities.Item;

public interface ItemRepository extends JpaRepository <Item, Integer>
{
	
}
