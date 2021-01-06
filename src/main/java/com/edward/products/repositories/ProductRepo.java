package com.edward.products.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.edward.products.models.Product;

@Repository
public interface ProductRepo extends CrudRepository<Product, Long>{
	List<Product> findAll();
}
