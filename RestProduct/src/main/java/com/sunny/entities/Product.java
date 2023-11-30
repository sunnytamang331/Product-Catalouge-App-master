package com.sunny.entities;

import jakarta.persistence.*;

@Entity
@Table(name="product_table")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long productId;
	private String productName;
	private Long productPrice;
	@Lob
	private byte[] productPicture;
	private String productBrand;
	private String productDescription;
	
	public Product(){
		
	}
	
	public Product(Long productId, String productName, Long productPrice, byte[] productPicture, String productBrand,
			String productDescription) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productPicture = productPicture;
		this.productBrand = productBrand;
		this.productDescription = productDescription;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Long getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Long productPrice) {
		this.productPrice = productPrice;
	}

	public byte[] getProductPicture() {
		return productPicture;
	}

	public void setProductPicture(byte[] productPicture) {
		this.productPicture = productPicture;
	}

	public String getProductBrand() {
		return productBrand;
	}

	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	
}
