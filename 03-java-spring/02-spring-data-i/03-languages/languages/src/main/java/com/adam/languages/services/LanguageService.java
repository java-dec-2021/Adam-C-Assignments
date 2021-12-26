package com.adam.languages.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adam.languages.models.Language;
import com.adam.languages.repositories.LanguageRepository;

@Service
public class LanguageService {
	
	@Autowired
	private LanguageRepository languageRepository;

	public LanguageService(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}
	
	// Get all languages
	public List<Language> getAllLanguages() {
		return this.languageRepository.findAll();
	}
	
	//Find language by ID
	public Language getLanguageByID(Long id) {
		return this.languageRepository.findById(id).get();
	}
	
	// Create Language
	public Language create(Language language) {
		return this.languageRepository.save(language);
	}
	// Edit Language
	public void updateLanguage(Long id, Language newLanguage) {
		Language language = this.languageRepository.findById(id).get();
		language.setName(newLanguage.getName());
		language.setCreator(newLanguage.getCreator());
		language.setCurrentVersion(newLanguage.getCurrentVersion());
	}
	// Delete Language
	public void delete(Long id) {
		this.languageRepository.deleteById(id);
	}
}
