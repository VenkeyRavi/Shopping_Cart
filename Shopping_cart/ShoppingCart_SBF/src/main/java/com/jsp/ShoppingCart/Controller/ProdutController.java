package com.jsp.ShoppingCart.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.ShoppingCart.DAO.ProductDao;
import com.jsp.ShoppingCart.DTO.ProductDto;
@RestController
public class ProdutController {

	@Autowired
	ProductDao dao;
	
	@PostMapping("/product") // End Point
	public ProductDto insertProduct(@RequestBody ProductDto pDto)
	{
		return dao.addProduct(pDto);
	}
	
	@GetMapping("/product")
	public ProductDto searchProduct(@RequestParam int id) {
		return dao.findById(id);
	}
	
	@DeleteMapping("/product")
	public String removeProduct(@RequestParam int id) {
		
		return dao.deleteProduct(id);
	}
	@GetMapping("/findAll")
	public List<ProductDto> displayAllProduct(){
		return dao.getData();
	}
	@PutMapping("/product")
	public String updateProductDto(@RequestParam int product_id, @RequestParam int newQuantity) {
		
		return dao.updateProduct(product_id, newQuantity);
	}
}
