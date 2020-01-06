package com.jocelyn.languages.controllers;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jocelyn.languages.models.Language;
import com.jocelyn.languages.services.LanguageService;

@Controller
@RequestMapping("/languages")
public class LanguagesController {
	private final LanguageService langServ;

	public LanguagesController(LanguageService langServ) {
        this.langServ = langServ;
    }
    
    @RequestMapping("")
    public String index(Model model) {
        List<Language> languages = langServ.allLanguages();
        model.addAttribute("languages", languages);
        return "/languages/index.jsp";
    }
    
    @RequestMapping("{id}")
	public String Show(@PathVariable("id") Long id, Model model) {
		model.addAttribute("language", langServ.findLanguage(id));
		return "/languages/show.jsp";
	}
	@RequestMapping("new")
	public String New(@ModelAttribute("language") Language language) {
		return "/languages/new.jsp";
	}
	@RequestMapping(value="", method=RequestMethod.POST)
	public String Create(@Valid @ModelAttribute("language") Language lang, BindingResult result, @RequestParam Map<String,String> body) {
		if(result.hasErrors())
			return "/languages/new.jsp";
		langServ.createLanguage(lang);
		return "redirect:/languages";
	}
	@RequestMapping("{id}/edit")
	public String Edit(@PathVariable("id") Long id, Model model) {
		model.addAttribute("language", langServ.findLanguage(id));
		return "/languages/edit.jsp";
	}
	@RequestMapping(value="{id}", method=RequestMethod.PUT)
	public String Update(@Valid @ModelAttribute("language") Language lang, BindingResult result) {
		if(result.hasErrors())
			return "/languages/edit.jsp";
		langServ.updateLanguage(lang);
		return "redirect:/languages";
	}
	@RequestMapping(value="{id}", method=RequestMethod.DELETE)
	public String Delete(@PathVariable("id") Long id) {
		langServ.deleteLanguage(id);
		return "redirect:/languages";
	}
}
