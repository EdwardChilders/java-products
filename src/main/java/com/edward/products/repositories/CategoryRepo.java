package com.edward.products.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.edward.products.models.Category;

@Repository
public interface CategoryRepo extends CrudRepository<Category, Long>{
	List<Category> findAll();
}
