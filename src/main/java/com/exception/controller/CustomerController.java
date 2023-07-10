//package com.exception.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.AuthenticationProvider;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.exception.AppConfiguration.CustomUserDetails;
//import com.exception.model.Cart;
//import com.exception.model.Customer;
//import com.exception.service.CartService;
//import com.exception.service.CustomerServices;
//
//@RestController
//public class CustomerController {
//	
//	@Autowired
//	CustomerServices customerServices;
//	
//	@Autowired
//	CustomUserDetails customUserDetails;
//	
//	@Autowired
//	AuthenticationProvider authenticationManager;
//	
////	@Autowired
////	PasswordEncoder passwordEncoder;
//
//	
//	@Autowired
//	CartService cartService;
//
//	
//	@RequestMapping(value = "/customer",method = RequestMethod.POST)
//	public ResponseEntity<Customer> addCus( @RequestBody Customer customer){
//	Customer cus=customerServices.addCustomer(customer);
//	
//	
////	cart.setId(cus.getId());
//		return new ResponseEntity<>(cus,HttpStatus.OK);
//	}
//	
//	@RequestMapping(value = "/customer/{id}", method = RequestMethod.DELETE)
//	public ResponseEntity<String> DeleteProduct(@PathVariable Integer id) { 
//		customerServices.removeCusById(id);
//		return new ResponseEntity<>("Customer Removed :"+id,HttpStatus.OK) ;
//	}
//	
//	@RequestMapping(value = "/customers",method = RequestMethod.GET)
//    public ResponseEntity<List<Customer>> getAllProducts() {
//        
//        return ResponseEntity.ok( customerServices.getAllCustomers());
//    }
//	
//	@PostMapping("/addtocart")
//	public Cart addToCart(@RequestBody Cart cart) {
////		
////		UserDetails userDetailsService=customUserDetails.loadUserByUsername(cart.getCustomer().getCus_name());
////	if(userDetailsService.getUsername()==cart.getCustomer().getCus_name()) {
////		authenticationManager.authenticate((Authentication) userDetailsService);
//		return  cartService.addtoCart(cart);}
//	
////	else {
////        throw new UsernameNotFoundException("invalid user request !");
//		 
//	
//	
//}
