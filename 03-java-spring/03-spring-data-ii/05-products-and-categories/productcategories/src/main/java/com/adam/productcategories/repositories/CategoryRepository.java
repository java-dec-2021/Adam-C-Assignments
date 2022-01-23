package com.adam.productcategories.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.adam.productcategories.models.Category;
import com.adam.productcategories.models.Product;

@Repository
public interface CategoryRepository extends CrudRepository<Category,Long>{

//Find all Products
	List<Category> findAll();
	
// Retrieve category by ID
	Optional<Category> findById(Long id);

// Retrieves a list of all categories for a particular product
    List<Category> findAllByProducts(Product product);
    
// Retrieves a list of any categories a particular product
// does not belong to.
    List<Category> findByProductsNotContains(Product product);

}
