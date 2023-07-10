package com.exception.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Cart {

	public Cart() {
	}

	public Cart(Integer id, Float total_amount,Customer customer, List<Product> product ) {
		super();
		this.id = id;
		this.total_amount = total_amount;
		this.product = product;
				this.customer = customer;
	}

	public Integer getId() {
		return id;
	}



	public void setId(Integer Id) {
		this.id = Id;
	}

	public Float getTotal_amount() {
		return total_amount;
	}

	public void setTotal_amount(Float total_amount) {
		this.total_amount = total_amount;
	}



	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cart_id")
	private Integer id;
	private Float total_amount;

	@ManyToMany(cascade = CascadeType.MERGE )
	@JoinTable(name = "product_cart",joinColumns = @JoinColumn(name="cart_id",referencedColumnName = "cart_id"),
	inverseJoinColumns = @JoinColumn(name="product_id",referencedColumnName = "product_id"))
	private List<Product> product;

			@OneToOne(cascade = CascadeType.MERGE)
			@JoinColumn(name="cus_id",referencedColumnName = "id")
			private Customer customer;




}
