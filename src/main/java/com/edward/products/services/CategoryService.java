package com.edward.products.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edward.products.models.Category;
import com.edward.products.repositories.CategoryRepo;



@Service
public class CategoryService {
	@Autowired
	private CategoryRepo categoryRepo;
	
	// get all
	public List<Category> allCategories(){
		return categoryRepo.findAll();
	}
	
	// find by id
	public Category findById(Long id) {
		Optional<Category> category = categoryRepo.findById(id);
		
		if(category.isPresent()) {
			return category.get();
		}else {
			return null;
		}
	}
	
	// create and update
	public Category save(Category category) {
		return categoryRepo.save(category);
	}
	
	// delete
	public void delete(Long id) {
		categoryRepo.deleteById(id);
	}
}
