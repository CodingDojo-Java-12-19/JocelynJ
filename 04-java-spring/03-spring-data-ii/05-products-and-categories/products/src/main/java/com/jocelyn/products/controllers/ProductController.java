package com.jocelyn.products.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import com.jocelyn.products.models.Category;
import com.jocelyn.products.models.CategoryProduct;
import com.jocelyn.products.models.Product;
import com.jocelyn.products.services.AppService;

@Controller
public class ProductController {
	private AppService appService;
	public ProductController(AppService service) {
		this.appService = service;
	}
	@GetMapping("/")
	public String Index(Model model) {
		model.addAttribute("products", appService.findProducts());
		return "products/index.jsp";
	}
	@GetMapping("/{id}")
	public String Show(@ModelAttribute("cp") CategoryProduct cp, 
		@PathVariable("id") Long id, Model model) {
		Product product = appService.getProduct(id);
		List<Category> others = appService.findCategoriesNotInProduct(product);
		model.addAttribute("product", product);
		model.addAttribute("notInCategories", others);
		return "products/show.jsp";
	}
}
