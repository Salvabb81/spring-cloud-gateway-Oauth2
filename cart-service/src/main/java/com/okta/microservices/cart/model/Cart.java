package com.okta.microservices.cart.model;

import java.util.ArrayList;
import java.util.List;

import javax.money.MonetaryAmount;
import javax.persistence.*;

import lombok.Data;

@Entity
@Data
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String customerId;

	@Convert(converter = MonetaryAmountConverter.class)
	private MonetaryAmount total;

	@OneToMany(cascade = CascadeType.ALL)
	private List<LineItem> lineItems = new ArrayList<>();

	public void addLineItem(LineItem lineItem) {
		this.lineItems.add(lineItem);
	}

}
