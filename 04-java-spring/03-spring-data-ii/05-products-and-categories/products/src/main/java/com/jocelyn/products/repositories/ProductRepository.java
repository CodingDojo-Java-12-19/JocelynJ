package com.jocelyn.products.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jocelyn.products.models.Category;
import com.jocelyn.products.models.Product;

public interface ProductRepository extends CrudRepository<Product, Long>{
	List<Product> findAll();
	List<Product> findByCategoriesNotContains(Category category);
}
