package com.jocelyn.languages.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jocelyn.languages.models.Language;
import com.jocelyn.languages.repositories.LanguageRepository;

@Service
public class LanguageService {
private final LanguageRepository langRepo;
    
    public LanguageService(LanguageRepository langRepo) {
        this.langRepo = langRepo;
    }
    
    public List<Language> allLanguages() {
        return langRepo.findAll();
    }
    
    public Language createLanguage(Language lang) {
        return langRepo.save(lang);
    }
    
    public Language findLanguage(Long id) {
        Optional<Language> optionalLanguage = langRepo.findById(id);
        if(optionalLanguage.isPresent()) {
            return optionalLanguage.get();
        } else {
            return null;
        }
    }
	
	public Language updateLanguage(Language lang) {
		return langRepo.save(lang);
	}
	
	public void deleteLanguage(Long id) {
		langRepo.deleteById(id);
	}
}
