package com.exception.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.exception.dto.OrderDto;
import com.exception.model.Cart;
import com.exception.repository.CartRepository;

@Service
public class CartService {

	@Autowired
	CartRepository cartRepository;

	@Autowired
	ProductService productService;


	public Cart findById(Integer id) {

		// TODO Auto-generated method stub
		return cartRepository.findById(id).get();
	}


	public Cart addtoCart( Cart cart ) {

//		float total=0;
//		cart.setTotal_amount(total);
//		int qty=0;
//
//		for(int i=0;i<cart.getProduct().size();i++) {
//			total=total+cart.getProduct().get(i).getPrice();
//			qty=cart.getProduct().get(i).getquantity();
//			int id=cart.getProduct().get(i).getId();
//
//			productService.reduceQuantity(id, qty);
////			System.out.println("******"+p.get(i).getQuantity()+"********");
//			cart.setTotal_amount(total*qty);
//		}



		return cartRepository.save(cart);
		// TODO Auto-generated method stub

	}


	public void deleteById(Integer id) {
		cartRepository.deleteById(id);
		// TODO Auto-generated method stub

	}


	public Cart update(Integer id) {
		Cart cart0=new Cart();
		Cart cart1=cartRepository.findById(id).get();
		cart1.setId(cart0.getId());
		cart1.setTotal_amount(cart0.getTotal_amount());
		cartRepository.save(cart1);
		// TODO Auto-generated method stub
		return null;
	}

}
