package com.adam.productcategories.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.adam.productcategories.models.Category;
import com.adam.productcategories.models.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product,Long> {

//Find all Products
	List<Product> findAll();
	
// Retrieve category by ID
	Optional<Product> findById(Long id);
	
// Retrieves a list of all products for a particular category
    List<Product> findAllByCategories(Category category);
    
// Retrieves a list of any products a particular category
// does not belong to.
    List<Product> findByCategoriesNotContains(Category category);
}
