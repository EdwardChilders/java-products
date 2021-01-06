package com.edward.products.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edward.products.models.Product;
import com.edward.products.repositories.ProductRepo;

@Service
public class ProductService {
	@Autowired
	private ProductRepo productRepo;
	
	// get all
	public List<Product> allProducts(){
		return productRepo.findAll();
	}
	
	// find by id
	public Product findById(Long id) {
		Optional<Product> product = productRepo.findById(id);
		
		if(product.isPresent()) {
			return product.get();
		}else {
			return null;
		}
	}
	
	// create and update
	public Product save(Product product) {
		return productRepo.save(product);
	}
	
	// delete
	public void delete(Long id) {
		productRepo.deleteById(id);
	}
}
