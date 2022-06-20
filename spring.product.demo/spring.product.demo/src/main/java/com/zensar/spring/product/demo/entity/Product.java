package com.zensar.spring.product.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
//@NamedQueries(value = { @NamedQuery(name = "Product.test", query = "from Product p where p.productName=?1"),
//@NamedQuery(name = "Product.test1", query = "from Product p where p.productName=?1 And p.productPrice=?2")})

//@NamedNativeQueries(value = { @NamedNativeQuery(name = "Product.test", query = "select * from product p where p.product_name=?1",resultClass = Product.class),
//@NamedNativeQuery(name = "Product.test1", query = "select * from product p where p.product_name=?1 and p.product_price=?2",resultClass = Product.class)})

public class Product {
	@Id
	private int productId;
	private String productName;
	private int productPrice;

	public Product() {
		super();
	}

	public Product(int productId, String productName, int productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}

}