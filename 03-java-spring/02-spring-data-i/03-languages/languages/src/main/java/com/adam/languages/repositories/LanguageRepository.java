package com.adam.languages.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.adam.languages.models.Language;

@Repository
public interface LanguageRepository extends CrudRepository<Language, Long> {
	
	//Get list of languages
	List<Language> findAll();
	//Delete language by id
	void deleteById(Long id);
}