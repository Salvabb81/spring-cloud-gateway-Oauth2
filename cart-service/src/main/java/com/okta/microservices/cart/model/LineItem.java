package com.okta.microservices.cart.model;

import javax.money.MonetaryAmount;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class LineItem {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String productName;

	private Integer quantity;

	@Convert(converter = MonetaryAmountConverter.class)
	private MonetaryAmount price;

}
