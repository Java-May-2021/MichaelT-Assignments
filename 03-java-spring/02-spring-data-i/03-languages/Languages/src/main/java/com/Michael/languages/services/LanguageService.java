package com.Michael.languages.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Michael.languages.models.Language;
import com.Michael.languages.repositories.LanguageRepository;

@Service
public class LanguageService {
	@Autowired
	private LanguageRepository langRepo;
	
	public List<Language> allLanguages(){
		return this.langRepo.findAll();
	}
	
	public Language createLanguage(Language createLanguage) {
		return this.langRepo.save(createLanguage);
	}
	
	public Language findOneLanguage(Long id) {
		return this.langRepo.findById(id).orElse(null);
	}
	
	public Language updateLanguage(Language updateLanguage) {
		return this.langRepo.save(updateLanguage);
	}
	
	public void deleteLanguage(Long id) {
		this.langRepo.deleteById(id);
	}
}
