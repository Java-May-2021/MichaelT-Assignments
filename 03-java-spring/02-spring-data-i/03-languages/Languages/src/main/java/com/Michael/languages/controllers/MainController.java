package com.Michael.languages.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.Michael.languages.models.Language;
import com.Michael.languages.services.LanguageService;

@Controller
public class MainController {
	@Autowired
	private LanguageService languageService;
	
	
	@GetMapping("/")
	public String dashboard(Model viewModel, @ModelAttribute("lang") Language language) {
		viewModel.addAttribute("getLanguage", this.languageService.allLanguages());
		return "dashboard.jsp";
	}
	
	@PostMapping("/")
	public String addLanguage(@Valid @ModelAttribute("lang") Language language, BindingResult result,  Model viewModel){
		if(result.hasErrors()) {
			viewModel.addAttribute("getLanguage", this.languageService.allLanguages());
			return "dashboard.jsp";
		}
		this.languageService.createLanguage(language);
		return "redirect:/";
	}
	
	@GetMapping("/{id}")
	public String showLanguage(Model viewModel, @PathVariable("id") Long id ) {
		viewModel.addAttribute("oneLanguage", this.languageService.findOneLanguage(id));
		return "show.jsp";
	}
	
	@GetMapping("/edit/{id}")
	public String editLang(Model viewModel, @PathVariable("id") Long id) {
		viewModel.addAttribute("language", this.languageService.findOneLanguage(id));
		return "edit.jsp";
	}
	
	@PutMapping("/edit/{id}")
	public String editLang(@Valid @ModelAttribute("language") Language language, BindingResult result, Model viewModel, @PathVariable("id") Long id) {
		if(result.hasErrors()) {
			viewModel.addAttribute("language", this.languageService.findOneLanguage(id));
			return "edit.jsp";
		}
		this.languageService.updateLanguage(language);
		return "redirect:/{id}";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteLang(@PathVariable("id") Long id) {
		this.languageService.deleteLanguage(id);
		return "redirect:/";
	}

}
