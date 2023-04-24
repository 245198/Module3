package com.ust.rest.resource;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Document
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Product {
	private String _id;
	private String name;
	private String description;
	private BigDecimal price;
	private int qty;
	
	
//	public int getQty() {
//		return qty;
//	}
//	public void setQty(int qty) {
//		this.qty = qty;
//	}
//	public long getProductId() {
//		return productId;
//	}
//	public void setProductId(long productId) {
//		this.productId = productId;
//	}
//	public String getProductName() {
//		return productName;
//	}
//	public void setProductName(String productName) {
//		this.productName = productName;
//	}
//	public String getDescription() {
//		return description;
//	}
//	public void setDescription(String description) {
//		this.description = description;
//	}
//	public BigDecimal getPrice() {
//		return price;
//	}
//	public void setPrice(BigDecimal price) {
//		this.price = price;
//	}
	
	

}





//select next_val as id_val from hibernate_sequence for update
//Hibernate: update hibernate_sequence set next_val= ? where next_val=?
//Hibernate: insert into product (description, price, product_name, qty, product_id) values (?, ?, ?, ?, ?)


//default generationtype is AUTO, generation type is strategy the JPA should use or follow to generate primary key values
	//when the strategy is not specified the generation uses AUTO
	//when the underlying database is mysql the generationtype=auto means, the JPA will create a hypernet sequence in the database 
	//for generation of primary keys
	
	//GenerationType.Identity => for this strategy to work first we have to create a table in mysql and explicitly specify the
	//autoincrement column as checked for the primary key column and in application.properties file 
	//#spring.jpa.hibernate.ddl-auto=none this should not be set if it is set you should have value as update 





