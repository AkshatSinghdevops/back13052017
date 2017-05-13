package com.niit.shoppingcart.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name="Product")  //if the class name and table name is different
@Component
public class Product {
	
	@Id
	private String id;
	
	private String name;
	
	private double price;
	
	public void setPrice(double price) {
		this.price = price;
	}

	private String  description;
	

	
	private String  category_id;
	
	private String  supplier_id;
	
	@Transient
	private MultipartFile image;
	
	
	@ManyToOne
	@JoinColumn(name = "category_id", updatable = false, insertable = false, nullable = false)
	private Category category;

	@ManyToOne
	@JoinColumn(name = "supplier_id", nullable = false, updatable = false, insertable = false)
	private Supplier supplier;
	
	
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	

	public String getcategory_id() {
		return category_id;
	}

	public void setcategory_id(String category_id) {
		category_id = category_id;
	}

	public String getsupplier_id() {
		return supplier_id;
	}

	public void setsupplier_id(String supplier_id) {
		supplier_id = supplier_id;
	}

	public MultipartFile getImage() {
		return image;
	}

	public void setImage(MultipartFile image) {
		this.image = image;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	
	
	
	
}
