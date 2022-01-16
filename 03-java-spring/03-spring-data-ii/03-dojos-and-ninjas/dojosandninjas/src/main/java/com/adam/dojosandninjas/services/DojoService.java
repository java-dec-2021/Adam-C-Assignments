package com.adam.dojosandninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.adam.dojosandninjas.models.Dojo;
import com.adam.dojosandninjas.repositories.DojoRepository;

@Service
public class DojoService {
	private final DojoRepository dojoRepository;
	
	public DojoService(DojoRepository dojoRepository) {
		this.dojoRepository=dojoRepository;
	}
	
	//Return all Dojos
	public List<Dojo> getAllDojos() {
		return dojoRepository.findAll();
	}
	
	//Get Dojo by Id
	public Optional<Dojo> getDojoById(Long id ) {
		return dojoRepository.findById(id);
	}
	
	//Create a new dojo
	public Dojo createDojo(Dojo dojo) {
		return dojoRepository.save(dojo);
	}
	
	//Delete a dojo
	public void deleteDojoById(Long id) {
		dojoRepository.deleteById(id);
	}
}
