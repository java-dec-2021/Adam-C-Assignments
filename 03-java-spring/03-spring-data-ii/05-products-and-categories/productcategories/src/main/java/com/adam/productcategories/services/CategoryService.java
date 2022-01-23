package com.adam.productcategories.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.adam.productcategories.models.Category;
import com.adam.productcategories.models.Product;
import com.adam.productcategories.repositories.CategoryRepository;
import com.adam.productcategories.repositories.ProductRepository;

@Service
public class CategoryService {
	private final CategoryRepository categoryRepository;
	private final ProductRepository productRepository;
	
	public CategoryService(CategoryRepository categoryRepository,ProductRepository productRepository) {
		this.categoryRepository=categoryRepository;
		this.productRepository=productRepository;
	}
	
// Create a new category	
	public Category createCategory(Category category) {
		return categoryRepository.save(category);
	}
	
// List all categories
	public List<Category> getAllCategories() {
		return categoryRepository.findAll();
	}

// Return a category by specifying an ID
	public Category getCategoryById(Long categoryId) {
		return categoryRepository.findById(categoryId).get();
	}

// Return a category by specifying a product
	public List<Category> findCategoryByProduct(Product product) {
		return categoryRepository.findAllByProducts(product);
	}
	
// Return categories not associated with a specific product
	public List<Category> findCategoriesNotAssignedToProduct(Product product) {
		return categoryRepository.findByProductsNotContains(product);
	}	

// Add a product to a category
	public Category addProductToCategoryById(Long productId,Long categoryId) {
		// retrieve an instance of a category
		Category thisCategory = getCategoryById(categoryId);
		
		// retrieve an instance of a product
		Product thisProduct = productRepository.findById(productId).get();
		
		// add the product to this category's list of products
		thisCategory.getProducts().add(thisProduct);
		
		// Save thisCategory, since you made changes to its product list.
		return categoryRepository.save(thisCategory);
	}
}