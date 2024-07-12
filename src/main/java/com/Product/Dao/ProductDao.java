package com.Product.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.Product.Entity.Product;
import com.Product.Repository.ProductRepository;


@Repository
public class ProductDao {
	@Autowired
	ProductRepository er;
	
	public String postAll(List<Product> e) {
		er.saveAll(e);
		return "Posted in Successfully";
	}
	
	public List<Product> getProduct() {
		return er.findAll();
	}

}
