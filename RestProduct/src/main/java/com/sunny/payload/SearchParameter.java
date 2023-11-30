package com.sunny.payload;

import lombok.Data;

/**
 * The Class SearchParameter.
 */
@Data
public class SearchParameter {
	
	/** The name. */
	String name;
	
	/** The brand. */
	String brand;
	
	/** The id. */
	Long id;
	
	
	/**
	 * Instantiates a new search parameter.
	 *
	 * @param name the name
	 * @param brand the brand
	 * @param id the id
	 */
	public SearchParameter(String name, String brand, Long id) {
		super();
		this.name = name;
		this.brand = brand;
		this.id = id;
	}
	
	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Gets the brand.
	 *
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}
	
	/**
	 * Sets the brand.
	 *
	 * @param brand the new brand
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	
	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(Long id) {
		this.id = id;
	}
}
