package com.exception.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.exception.model.Product;
import com.exception.service.ProductService;

import jakarta.validation.Valid;

@RestController
public class ProductServiceController {

	@Autowired
	ProductService productService;

	@RequestMapping(value = "/products",method = RequestMethod.POST)
	public ResponseEntity<List<Product>> addProducts(@Valid @RequestBody List<Product> product){
	List<Product> prd=productService.addProduct(product);
		return new ResponseEntity<>(prd,HttpStatus.OK);
	}

	@RequestMapping(value = "/products/{id}", method = RequestMethod.GET)
	public ResponseEntity<Product> getProduct(@PathVariable Integer id) { 
		return new ResponseEntity<>(productService.findPrdById(id),HttpStatus.OK) ;
	}

	
	@RequestMapping(value = "/product/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<String> DeleteProduct(@PathVariable Integer id) { 
		productService.removePrdById(id);
		return new ResponseEntity<>("deleted :"+id,HttpStatus.OK) ;
	}
	
	  @RequestMapping(value = "/products",method = RequestMethod.GET)
	    public ResponseEntity<List<Product>> getAllProducts() {

	        List<Product> productList = productService.getAllProducts();

	        return ResponseEntity.ok(productList);
	    }
	  @RequestMapping(value = "/product", method = RequestMethod.PUT)
		public ResponseEntity<String> editProduct(@Valid @RequestBody Product product) { 
		  productService.editPrd(product);
			return new ResponseEntity<>("Changes Updated!! ",HttpStatus.OK) ;
		}
}
