package com.jocelyn.products.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jocelyn.products.models.Category;
import com.jocelyn.products.models.Product;

public interface CategoryRepository extends CrudRepository<Category, Long>{
	List<Category> findAll();
	List<Category> findByProductsNotContains(Product product);
}
