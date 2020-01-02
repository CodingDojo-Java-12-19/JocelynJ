package com.jocelyn.products.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jocelyn.products.models.Category;
import com.jocelyn.products.models.CategoryProduct;
import com.jocelyn.products.models.Product;
import com.jocelyn.products.repositories.CategoryProductRepository;
import com.jocelyn.products.repositories.CategoryRepository;
import com.jocelyn.products.repositories.ProductRepository;

@Service
public class AppService {
	private final ProductRepository pRepo;
	private final CategoryRepository cRepo;
	private final CategoryProductRepository cpRepo;
	public AppService(ProductRepository pRepo, CategoryRepository cRepo, CategoryProductRepository cpRepo) {
		this.pRepo = pRepo;
		this.cRepo = cRepo;
		this.cpRepo = cpRepo;
	}
	
	public List<Product> findProducts() {
		return this.pRepo.findAll();
	}
	
	public Product getProduct(Long id) {
		return this.pRepo.findById(id).orElse(null);
	}
	
	public List<Category> findCategories() {
		return this.cRepo.findAll();
	}
	
	public Product createProduct(Product product) {
		return this.pRepo.save(product);
	}
	
	public CategoryProduct createCategoryProduct(CategoryProduct cp) {
		return this.cpRepo.save(cp);
	}
	
	public List<Category> findCategoriesNotInProduct(Product product) {
		return cRepo.findByProductsNotContains(product);
	}
	
	public List<Product> findProductsNotInCategory(Category category) {
		return pRepo.findByCategoriesNotContains(category);
	}
}
