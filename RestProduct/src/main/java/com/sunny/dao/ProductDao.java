package com.sunny.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sunny.entities.Product;

// TODO: Auto-generated Javadoc
/**
 * The Interface ProductDao.
 */
@Repository
public interface ProductDao extends JpaRepository<Product, Long> {
	
	/**
	 * Find by product name.
	 *
	 * @param name the name
	 * @return the optional
	 */
	Optional<List<Product>> findByProductName(String name);
	
	/**
	 * Find by product brand.
	 *
	 * @param brand the brand
	 * @return the optional
	 */
	Optional<List<Product>> findByProductBrand(String brand);
	
	/**
	 * Find by product name or product brand or product id.
	 *
	 * @param name the name
	 * @param brand the brand
	 * @param id the id
	 * @return the optional
	 */
	Optional<List<Product>> findByProductNameOrProductBrandOrProductId(String name,String brand,Long id);
	
}
