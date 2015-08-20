package com.netbuilder.entities;

import java.io.Serializable;

import com.netbuilder.enums.OrderStatus;

/**
 * @author ngilbert
 */

public class Order implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int orderId;
	private PaymentDetails paymentDetails;
	private OrderStatus status;
	private String datePlaced;
	
	public Order(int orderId, PaymentDetails paymentDetails, OrderStatus status, String datePlaced){
		this.orderId = orderId;
		this.paymentDetails = paymentDetails;
		this.status = status;
		this.datePlaced = datePlaced;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public PaymentDetails getPaymentDetails() {
		return paymentDetails;
	}

	public void setPaymentDetails(PaymentDetails paymentDetails) {
		this.paymentDetails = paymentDetails;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public String getDatePlaced() {
		return datePlaced;
	}

	public void setDatePlaced(String datePlaced) {
		this.datePlaced = datePlaced;
	}
	
}
