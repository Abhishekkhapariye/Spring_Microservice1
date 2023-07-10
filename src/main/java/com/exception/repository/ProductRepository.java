package com.exception.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exception.model.Product;

@Repository
public  interface ProductRepository extends JpaRepository<Product, Integer> {
//
//	  @Query("SELECT p FROM Product p WHERE " +
//	            "p.name LIKE CONCAT('%',:query, '%')" +
//	            "Or p.description LIKE CONCAT('%', :query, '%')")
//	    List<Product> searchProducts(String query);
//	

}
