package com.jsp.ShoppingCart.DTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class ProductDto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int product_id;
	private String product_name;
	private int quantity;
	private String description;
	
	
	
	
	
	
		
	
	

}
