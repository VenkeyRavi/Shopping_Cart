package com.jsp.ShoppingCart.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.ShoppingCart.DTO.ProductDto;

public interface ProductRepository extends JpaRepository<ProductDto, Integer>
{


}
