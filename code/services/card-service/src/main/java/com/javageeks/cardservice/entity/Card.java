package com.javageeks.cardservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.javageeks.cardservice.exception.InvalidCardTypeException;
import com.javageeks.cardservice.util.Constants;

@Entity(name="card")
@Table(name="card")
public class Card {
	@Id
	@GeneratedValue
	private Long id;
	private Long userId;
	private String cardNumber;
	private String cardHolderName;
	private String cardExpirationDate;
	private double cardBalance;
	private String cardType;
	private String defaultCard;
	private String status;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardHolderName() {
		return cardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
	public String getCardExpirationDate() {
		return cardExpirationDate;
	}
	public void setCardExpirationDate(String cardExpirationDate) {
		this.cardExpirationDate = cardExpirationDate;
	}
	
	public double getCardBalance() {
		return cardBalance;
	}
	public void setCardBalance(double cardBalance) {
		this.cardBalance = cardBalance;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) throws InvalidCardTypeException {
		if (!cardType.equals("CC") && !cardType.equals("GC"))
			throw new InvalidCardTypeException();
		this.cardType = cardType;
	}

	public String getDefaultCard() {
		return defaultCard;
	}
	public void setDefaultCard(String defaultCard) {
		this.defaultCard = defaultCard;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		if (status == null || status.equals(""))
			status=Constants.ACTIVE_STATUS;
		this.status = status;
	}

}
