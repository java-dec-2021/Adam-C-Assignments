package com.adam.productcategories.controllers;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.adam.productcategories.models.Category;
import com.adam.productcategories.models.Product;
import com.adam.productcategories.services.CategoryService;
import com.adam.productcategories.services.ProductService;

@Controller
public class HomeController {
	@Autowired
	private CategoryService categoryService;
	@Autowired
	private ProductService productService;

	
// Mapping for landing page
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("allCategories", categoryService.getAllCategories());
		model.addAttribute("allProducts", productService.getAllProducts());
		return "dashboard.jsp";
	}
	
	
	
// Mappings for page creating a new category
	@GetMapping("/categories/new")
	public String categoryCreation(Model model) {
		model.addAttribute("newCategory", new Category());
		return "categories/NewCategory.jsp";
	}

	@PostMapping("/categories/new")
	public String createCategory(@Valid @ModelAttribute("newCategory") Category category, BindingResult result) {
		if (result.hasErrors()) {
			return "categories/NewCategory.jsp";
		} else {
			this.categoryService.createCategory(category);
			return "redirect:/categories/"+category.getId();
		}
	}

// Mappings for page creating a new product
	@GetMapping("/products/new")
	public String productCreation(Model model) {
		model.addAttribute("newProduct", new Product());
		return "products/NewProduct.jsp";
	}

	@PostMapping("/products/new")
	public String createProduct(@Valid @ModelAttribute("newProduct") Product product, BindingResult result) {
		if (result.hasErrors()) {
			return "products/NewProduct.jsp";
		} else {
			this.productService.createProduct(product);
			return "redirect:/products/"+product.getId();
		}
	}

// Mapping to view a category by ID and add products from dropdown
	@GetMapping("/categories/{id}")
	public String viewCategory(Model model, @PathVariable("id") Long CategoryId) {
		Category currentCategory = categoryService.getCategoryById(CategoryId);
		model.addAttribute("currentCategory", currentCategory);
		model.addAttribute("productsAssigned", productService.findProductByCategory(currentCategory));
		model.addAttribute("productsNotAssigned", productService.findProductsNotAssignedToCategory(currentCategory));
		model.addAttribute("addProduct", new Product());
		return "categories/ViewCategory.jsp";
	}

	@PostMapping("/categories/{id}")
	public String addProductToCategory(@PathVariable("id") Long categoryId,
			@ModelAttribute("addProduct") Product addProduct) {
		categoryService.addProductToCategoryById(addProduct.getId(), categoryId);
		return "redirect:/categories/"+categoryId;
	}
	
	
	
// Mapping to view a product by ID and add categories from a dropdown
	@GetMapping("/products/{id}")
	public String viewProduct(Model model, @PathVariable("id") Long productId) {
		Product currentProduct = productService.getProductById(productId);
		model.addAttribute("currentProduct", currentProduct);
		model.addAttribute("categoriesAssigned", categoryService.findCategoryByProduct(currentProduct));
		model.addAttribute("categoriesNotAssigned", categoryService.findCategoriesNotAssignedToProduct(currentProduct));
		model.addAttribute("addCategory", new Category());
		return "products/ViewProduct.jsp";
	}
	
	@PostMapping("/products/{id}")
	public String addCategoryToProject(@PathVariable("id") Long productId,
			@ModelAttribute("addCategory") Category addCategory) {
		productService.addCategoryToProductById(addCategory.getId(), productId);
		return "redirect:/products/"+productId;
	}

	
	
}