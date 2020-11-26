package com.okta.microservices.cart.repository;

import org.springframework.data.repository.CrudRepository;

import com.okta.microservices.cart.model.Cart;

public interface CartRepository extends CrudRepository<Cart, Integer> {

}
