package com.adam.dojosandninjas.services;

import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.adam.dojosandninjas.models.Ninja;
import com.adam.dojosandninjas.repositories.NinjaRepository;

@Service
public class NinjaService {
	private final NinjaRepository ninjaRepository;
	
	public NinjaService(NinjaRepository ninjaRepository) {
		this.ninjaRepository=ninjaRepository;
	}
	
	// Return all ninja
	public List<Ninja> getNinja() {
		return ninjaRepository.findAll();
	}
	
	// Create new ninja
	public Ninja createNinja(Ninja ninja) {
		return ninjaRepository.save(ninja);
	}
	
	// Delete a ninja
	public void deleteNinjaById(Long id ) {
		ninjaRepository.deleteById(id);
	}
}
