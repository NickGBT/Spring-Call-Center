package com.netbuilder.entities;

import com.netbuilder.enums.ProductCategory;

/**
 * 
 * 
 * @author ngilbert
 *
 */

public class Product {

	private String imageLocation;
	private int productId;
	private String productName;
	private double productPrice;	
	private int width;
	private int height;
	private int length;
	private double weight;
	private String description;
	private ProductCategory category;
	
	public Product(String imageLocation, String productName,
			double productPrice, int width, int height, int length,
			double weight, String description, ProductCategory category) {
		this.imageLocation = imageLocation;
		this.productName = productName;
		this.productPrice = productPrice;
		this.width = width;
		this.height = height;
		this.length = length;
		this.weight = weight;
		this.description = description;
		this.category = category;
	}

	public String getImageLocation() {
		return imageLocation;
	}

	public void setImageLocation(String imageLocation) {
		this.imageLocation = imageLocation;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ProductCategory getCategory() {
		return category;
	}

	public void setCategory(ProductCategory category) {
		this.category = category;
	}
		
}
