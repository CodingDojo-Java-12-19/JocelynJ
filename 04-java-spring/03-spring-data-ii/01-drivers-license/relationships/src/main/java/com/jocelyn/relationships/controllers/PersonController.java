package com.jocelyn.relationships.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jocelyn.relationships.models.License;
import com.jocelyn.relationships.models.Person;
import com.jocelyn.relationships.services.LicenseService;
import com.jocelyn.relationships.services.PersonService;

@Controller
public class PersonController {
	
	private PersonService personServ;
	private LicenseService licenseServ;
	
	public PersonController(PersonService personServ, LicenseService licenseServ) {
		this.personServ = personServ;
		this.licenseServ = licenseServ;
	}
	
	@GetMapping(value="/persons")
	public String persons(Model model) {
		List<Person> persons = personServ.allPersons();
		model.addAttribute("persons", persons);
		return "/relationships/persons.jsp";
	}
	
	@RequestMapping("/persons/new")
	public String index(@ModelAttribute("person") Person person) {
		return "/relationships/new-person.jsp";
	}
	
    @RequestMapping(value="/persons", method=RequestMethod.POST)
    public String create(@Valid @ModelAttribute("person") Person person, BindingResult result) {
        if (result.hasErrors()) {
            return "/relationships/new-person.jsp";
        } else {
            personServ.createPerson(person);
            return "redirect:/persons";
        }
    }
    
	@GetMapping(value="/licenses")
	public String licenses(Model model) {
		List<License> licenses = licenseServ.allLicenses();
		model.addAttribute("licenses", licenses);
		return "/relationships/licenses.jsp";
	}
    
	@RequestMapping("/licenses/new")
	public String index(Model model, @ModelAttribute("license") License license) {
		List<Person> persons = personServ.allPersons();
		model.addAttribute("persons", persons);
		return "/relationships/new-license.jsp";
	}
    
    @RequestMapping(value="/license", method=RequestMethod.POST)
    public String create(@Valid @ModelAttribute("license") License license, BindingResult result) {
        if (result.hasErrors()) {
            return "/relationships/new-license.jsp";
        } else {
            licenseServ.createLicense(license);
            return "redirect:/licenses";
        }
    }
    
    @RequestMapping("/persons/{id}")
    public String showLicense(@PathVariable("id") Long id, Model model){
		model.addAttribute("person", personServ.getPerson(id));
    	return "/relationships/one-license.jsp";
    }
}
