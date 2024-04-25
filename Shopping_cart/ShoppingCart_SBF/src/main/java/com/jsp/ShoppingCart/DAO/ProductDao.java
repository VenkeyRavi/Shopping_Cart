package com.jsp.ShoppingCart.DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.jsp.ShoppingCart.DTO.ProductDto;
import com.jsp.ShoppingCart.Repository.ProductRepository;

@Repository
public class ProductDao {
	
	@Autowired
	ProductRepository repository;

	//store or add product object into shoppingcart
	public ProductDto addProduct(ProductDto pdto) {
		
		return repository.save(pdto);
	}
	public ProductDto findById(int id) {
		Optional<ProductDto> opt=repository.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}
		return null;
	}
	
	public String deleteProduct(int id) {
		ProductDto p=findById(id);
		if(p!=null) {
				//repository.deleteById(id);
			repository.delete(p);
			return "Product is removed from cart..";
		}
		return "Product is not available in cart...";
	}
	
	public List<ProductDto> getData(){
		return repository.findAll();
	}
	
	// Update Product Quntity based on Id
	
	public String updateProduct(int product_id,int newQuantity) {
			ProductDto p = findById(product_id);
			if(p!=null) {
			p.setQuantity(newQuantity);
					
			repository.save(p);
			return "Updated"+"to"+newQuantity;
			}
			else {
				return "Product is not there...";
			}
	}
}
