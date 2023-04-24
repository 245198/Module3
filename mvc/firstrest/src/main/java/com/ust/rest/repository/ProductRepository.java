package com.ust.rest.repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.stereotype.Repository;

import com.ust.rest.resource.Product;

@Repository
public class ProductRepository {
	
	
	public ProductRepository() {
		Product p1= new Product();
		p1.setProductId(101);
		p1.setProductName("Labtop");
		p1.setDescription("Macbook Retina Eye");
		p1.setPrice(new BigDecimal(180000));
		p1.setQty(5);
		productCache.add(p1);
		
		Product p2= new Product();
		p2.setProductId(102);
		p2.setProductName("Tablet");
		p2.setDescription("Samsung max view");
		p2.setPrice(new BigDecimal(35000));
		p2.setQty(10);
		productCache.add(p2);
		
		
		Product p3= new Product();
		p3.setProductId(103);
		p3.setProductName("Mobile");
		p3.setDescription("Iphone 14");
		p3.setPrice(new BigDecimal(75000));
		p3.setQty(7);
		productCache.add(p3);
		
		
		Product p4= new Product();
		p4.setProductId(104);
		p4.setProductName("Television");
		p4.setDescription("Sony Bravo 75\" ");
		p4.setPrice(new BigDecimal(75000));
		p4.setQty(7);
		productCache.add(p4);
		
		Product p5= new Product();
		p5.setProductId(105);
		p5.setProductName("Airconditioner");
		p5.setDescription("Samsung Xcool");
		p5.setPrice(new BigDecimal(44500));
		p5.setQty(15);
		productCache.add(p5);


	}
	
	private ArrayList<Product> productCache = new ArrayList<>();
	
	
	//C - create
	public boolean addProduct(Product product)
	{
		if(productCache .add(product))
		{
			return true;
		}
		else
			return false;
		
	}
	
	//R - retrieve
	public Product getProduct(long productId)
	{
		Iterator<Product> iter = productCache.iterator();
		Product product=null;
		while(iter.hasNext())
		{
			
			product =iter.next();
			if(product.getProductId() == productId)
				break;
		}
		if(product !=null)
			return product;
		else
			return null;
	}

	public ArrayList<Product> getProducts() {

		return productCache;
	}
	
	public Product updateProduct(Product productToUpdate)
	{
		Product searchProduct = null;
		Iterator<Product> iter = productCache.iterator();
		int index=0;
		while(iter.hasNext())
		{
			searchProduct=iter.next();
			if(searchProduct.getProductId() == productToUpdate.getProductId())
			{
				productCache.add(index,productToUpdate);
				productToUpdate = searchProduct;
			}
			index++;
		}
		return productToUpdate;
	}
	
	
	public void delete(long productId)
	{
		Product tempProduct = null;
		Iterator<Product> iter = productCache.iterator();
		int index=0;
		while(iter.hasNext())
		{
			tempProduct = iter.next();
			if(tempProduct.getProductId() == productId)
			{
				break;
			}
			index++;
		}
		productCache.remove(index);
	}

}
