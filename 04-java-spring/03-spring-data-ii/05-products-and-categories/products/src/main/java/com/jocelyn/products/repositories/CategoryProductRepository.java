package com.jocelyn.products.repositories;

import org.springframework.data.repository.CrudRepository;

import com.jocelyn.products.models.CategoryProduct;

public interface CategoryProductRepository extends CrudRepository<CategoryProduct, Long>{
	
}
