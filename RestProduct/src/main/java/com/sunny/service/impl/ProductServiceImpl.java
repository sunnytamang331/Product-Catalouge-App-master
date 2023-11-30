package com.sunny.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunny.dao.ProductDao;
import com.sunny.entities.Product;
import com.sunny.payload.SearchParameter;
import com.sunny.service.ProductService;

// TODO: Auto-generated Javadoc
/**
 * The Class ProductServiceImpl.
 */
@Service
public class ProductServiceImpl implements ProductService{

	
	/** The product dao. */
	@Autowired
	private ProductDao productDao;

	/**
	 * Gets the product details service.
	 *
	 * @param id the id
	 * @return the product details service
	 */
	@Override
	public Optional<Product> getProductDetailsService(Long id) {
		Optional<Product> product = productDao.findById(id);
		return product;
	}

	/**
	 * Gets the all product details.
	 *
	 * @return the all product details
	 */
	@Override
	public Optional<List<Product>> getAllProductDetails() {
		// TODO Auto-generated method 
		return Optional.ofNullable(productDao.findAll());
	}


	/**
	 * Gets the product by parameters.
	 *
	 * @param value the value
	 * @return the product by parameters
	 */
	@Override
	public Optional<List<Product>> getProductByParameters(SearchParameter value) {
		// TODO Auto-generated method stub
		return productDao.findByProductNameOrProductBrandOrProductId(value.getName(),
				value.getBrand(), value.getId());
	}
	
}
