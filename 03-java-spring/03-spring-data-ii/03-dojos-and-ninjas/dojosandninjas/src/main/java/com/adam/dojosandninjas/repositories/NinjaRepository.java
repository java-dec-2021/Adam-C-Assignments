package com.adam.dojosandninjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.adam.dojosandninjas.models.Ninja;

public interface NinjaRepository extends CrudRepository<Ninja,Long>{
	List<Ninja> findAll();
}
