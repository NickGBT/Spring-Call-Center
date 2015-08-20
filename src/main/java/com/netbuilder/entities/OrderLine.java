package com.netbuilder.entities;

/**
 * 
 * @author ngilbert
 *
 */

public class OrderLine {

	private Order order;
	private Product product;
	private int quantity;
	
	public OrderLine(Order order, Product product, int quantity) {

		this.order = order;
		this.product = product;
		this.quantity = quantity;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
