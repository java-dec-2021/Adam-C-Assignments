package com.adam.productcategories.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.adam.productcategories.models.Category;
import com.adam.productcategories.models.Product;
import com.adam.productcategories.repositories.CategoryRepository;
import com.adam.productcategories.repositories.ProductRepository;

@Service
public class ProductService {
	private final CategoryRepository categoryRepository;
	private final ProductRepository productRepository;

	public ProductService(CategoryRepository categoryRepository, ProductRepository productRepository) {
		this.categoryRepository = categoryRepository;
		this.productRepository = productRepository;
	}

// Create a new product
	public Product createProduct(Product product) {
		return productRepository.save(product);
	}

// List all products
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

// Return a product by specifying an ID
	public Product getProductById(Long productId) {
		return productRepository.findById(productId).get();
	}

// Return all products by specifying a category
	public List<Product> findProductByCategory(Category category) {
		return productRepository.findAllByCategories(category);
	}

// Return products not associated with a specific category
	public List<Product> findProductsNotAssignedToCategory(Category category) {
		return productRepository.findByCategoriesNotContains(category);
	}

// Add a category to a product
	public Product addCategoryToProductById(Long categoryId, Long productId) {
		Category thisCategory = categoryRepository.findById(categoryId).get();
		Product thisProduct = productRepository.findById(productId).get();
		thisProduct.getCategories().add(thisCategory);
		return productRepository.save(thisProduct);
	}
}
