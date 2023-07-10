package com.exception.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exception.model.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer>{






}
