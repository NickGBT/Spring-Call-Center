package com.netbuilder.entities;

import com.netbuilder.enums.CardType;

/**
 * 
 * @author ngilbert
 *
 */

public class PaymentDetails {

	private CardType cardType;
	private String cardNumber;
	private String nameOnCard;
	private int securityNumber;	
	private String expiryDate;
	private Order orderId;
	
	public PaymentDetails(CardType cardType, String cardNumber,
			String nameOnCard, int securityNumber, String expiryDate, Order orderId) {
		this.cardType = cardType;
		this.cardNumber = cardNumber;
		this.nameOnCard = nameOnCard;
		this.securityNumber = securityNumber;
		this.expiryDate = expiryDate;
		this.orderId = orderId;
	}

	public CardType getCardType() {
		return cardType;
	}

	public void setCardType(CardType cardType) {
		this.cardType = cardType;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getNameOnCard() {
		return nameOnCard;
	}

	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}

	public int getSecurityNumber() {
		return securityNumber;
	}

	public void setSecurityNumber(int securityNumber) {
		this.securityNumber = securityNumber;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public Order getOrderId() {
		return orderId;
	}

	public void setOrderId(Order orderId) {
		this.orderId = orderId;
	}
			
}
