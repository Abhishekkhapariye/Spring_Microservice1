package com.exception.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exception.exception.ProductNotfoundException;
import com.exception.model.Product;
import com.exception.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepository;
	
	
	
	public List<Product> addProduct(List<Product> product) {
		return productRepository.saveAll(product);

	}

	public Product findPrdById(Integer id) {
		// TODO Auto-generated method stub
		if(productRepository.existsById(id)) {
		return productRepository.findById(id).get();
	}else {
		throw new ProductNotfoundException();
	}

	}

	public void  removePrdById(Integer id) {
		// TODO Auto-generated method stub
		if(productRepository.existsById(id)) {
		 productRepository.deleteById(id);
		}else {
			throw new ProductNotfoundException();
		 
	}
	}

    public List<Product> getAllProducts() {
        return this.productRepository.findAll();
    }

	public void editPrd(Product pr) {
	Product	prod= productRepository.findById(pr.getId()).get();
		prod.setId(pr.getId());
		prod.setName(pr.getName());
		prod.setPrice(pr.getPrice());
		prod.setquantity(pr.getquantity());
		// TODO Auto-generated method stub
		productRepository.save(prod);
	}

	public void reduceQuantity(int id,int qty) {
		Product	prod= productRepository.findById(id).get();
		prod.setquantity(prod.getquantity()-qty);
		
		productRepository.save(prod);
		// TODO Auto-generated method stub
		
	}



}
	
	
	
