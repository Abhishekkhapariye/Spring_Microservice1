//package com.exception.AppConfiguration;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Component;
//
//import java.util.Optional;
//import com.exception.model.Customer;
//import com.exception.repository.CustomerRepository;
//
//@Component
//public class CustomUserDetails implements UserDetailsService {
//	
//	@Autowired
//	CustomerRepository customerRepository;
//
//	@Override
//	public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
//		Optional<Customer> customer = customerRepository.findByName(name);
//		
//		return customer.map( UserDetailServices::new).orElseThrow(()-> new UsernameNotFoundException("Not Found"));
//	}
//
//}
