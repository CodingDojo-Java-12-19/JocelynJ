package com.jocelyn.dojos.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jocelyn.dojos.models.Dojo;
import com.jocelyn.dojos.services.AppService;

@Controller
public class DojoController {
	private final AppService appService;
	public DojoController(AppService service) {
		this.appService = service;
	}
	@RequestMapping("/dojos")
	public String index(Model model) {
		List<Dojo> dojos = appService.allDojos();
		model.addAttribute("dojos", dojos);
		return "/dojos/index.jsp";
	}
	@RequestMapping("/dojos/{id}")
	public String showDojo(@PathVariable("id") Long id, Model model) {
		model.addAttribute("dojo", this.appService.findDojo(id));
		return "/dojos/show.jsp";
	}
	@RequestMapping("/dojos/new")
	public String newDojo(@ModelAttribute("dojo") Dojo dojo) {
		return "/dojos/new.jsp";
	}
	@RequestMapping(value="/dojos", method=RequestMethod.POST)
	public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if(result.hasErrors())
			return "/dojos/new.jsp";
		this.appService.createDojo(dojo);
		return "redirect:/dojos";
	}
}