package com.sunny.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sunny.entities.Product;
import com.sunny.payload.SearchParameter;
import com.sunny.service.ProductService;


 /* The Class ProductController.
 */
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ProductController {
	
	/** The product service. */
	@Autowired
	private ProductService productService;
	
	
	/**
	 * Gets the product by parameters.
	 *
	 * @param value the value
	 * @return the product by parameters
	 */
	@PostMapping("/search")
	public Optional<List<Product>> getProductByParameters(@RequestBody SearchParameter value){
		System.out.println(productService.getProductByParameters(value).get().get(0).getProductBrand());
		return productService.getProductByParameters(value);
	}
	
	/**
	 * Gets the all product details.
	 *
	 * @return the all product details
	 */
	@GetMapping("/product")
	public Optional<List<Product>> getAllProductDetails(){
		Optional<List<Product>> products = productService.getAllProductDetails();
		return products;
	}
	
	/**
	 * Gets the product details.
	 *
	 * @param productId the product id
	 * @return the product details
	 */
	@GetMapping("/product/{productId}")
	public  Optional<Product> getProductDetails(@PathVariable Long productId){
		return productService.getProductDetailsService(productId);
	}

}
