package com.exception.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//import com.exception.dto.OrderDto;
import com.exception.model.Cart;
import com.exception.service.CartService;

@RestController
public class CartController {
	
	@Autowired
	CartService cartService;
	
//	@Autowired
//	CustomerServices customerServices;
//	
//	@Autowired
//	ProductService productService;
	
//   @Autowired
//   OrderDto orderDto;
	
	
	
	@GetMapping("/Cart/{id}")
	public Cart viewCartById(@PathVariable Integer id) {
		return cartService.findById(id);
	}
	
	@DeleteMapping("/Cart/{id}")
	public String deleteCartById(@PathVariable Integer id) {
		 cartService.deleteById(id);
		 return "Cart Id "+id+" Removed";
	}
	
	@PutMapping("/update")
	public Cart updatecartQuantity(@PathVariable Integer id) {
		return cartService.update(id);
	}

		@PostMapping("/addtocart")
	public Cart addToCart(@RequestBody Cart cart) {
//
//		UserDetails userDetailsService=customUserDetails.loadUserByUsername(cart.getCustomer().getCus_name());
//	if(userDetailsService.getUsername()==cart.getCustomer().getCus_name()) {
//		authenticationManager.authenticate((Authentication) userDetailsService);
		return  cartService.addtoCart(cart);}

//	else {
//        throw new UsernameNotFoundException("invalid user request !");

}
