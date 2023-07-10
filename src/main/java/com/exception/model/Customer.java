package com.exception.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Customer {





	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name="cus_name")
	private String name;
	private Long cus_mob_no;
	private String password;
	

    

	public Customer() {

	}

	public Customer(Integer id, String name, Long cus_mob_no,String password) {
		super();
		this.id = id;
		this.name = name;
		this.cus_mob_no = cus_mob_no;
		this.password=password;
		//		this.products = products;
	}

	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCus_name() {
		return name;
	}

	public void setCus_name(String name) {
		this.name = name;
	}

	public Long getCus_mob_no() {
		return cus_mob_no;
	}

	public void setCus_mob_no(Long cus_mob_no) {
		this.cus_mob_no = cus_mob_no;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	//	public List<Product> getProducts() {
	//		return products;
	//	}
	//
	//	public void setProducts(List<Product> products) {
	//		this.products = products;
	//	}
	//



}
