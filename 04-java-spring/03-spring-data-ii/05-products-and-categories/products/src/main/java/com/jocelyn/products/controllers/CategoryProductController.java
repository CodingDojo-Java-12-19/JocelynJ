package com.jocelyn.products.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.jocelyn.products.models.CategoryProduct;
import com.jocelyn.products.services.AppService;

@Controller
public class CategoryProductController {
	private final AppService appService;
	public CategoryProductController(AppService service) {
		this.appService = service;
	}
	@PostMapping("/category_products/{kind}")
	public String Create(@Valid @ModelAttribute("cp") CategoryProduct cp,
			BindingResult result,
			@PathVariable("kind") String kind) {
		if(result.hasErrors())
			return String.format("/%s/show.jsp", kind);
		this.appService.createCategoryProduct(cp);
		return "redirect:/";
	}
}
