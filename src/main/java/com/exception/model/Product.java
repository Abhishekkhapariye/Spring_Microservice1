package com.exception.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


@Entity
@Table
public class Product {


	public Product(Integer id, @NotBlank(message = "Product Name is mandatory!!") String name,
				   @NotNull(message = "Product Price is mandatory!!") Float price,
				   @NotNull(message = "Product quantity is mandatory!!") Integer quantity) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public Product() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	private Integer id;
	@NotBlank(message = "Product Name is mandatory!!")
	private String name;
	@NotNull(message = "Product Price is mandatory!!")
	private Float price;
	@NotNull(message = "Product quantity is mandatory!!")
	private Integer quantity;



//    @SerialNumberConstraint(message = "must not be null!!")
//	private String serialnumber;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public Integer getquantity() {
		return quantity;
	}
	public void setquantity(Integer quantity) {
		this.quantity = quantity;
	}
	//	public String getserialnumber() {
//		return serialnumber;
//	}
//	public void setserialnumber(String serialnumber) {
//		this.serialnumber = serialnumber;
//	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity
				+	"]";
	}


}
