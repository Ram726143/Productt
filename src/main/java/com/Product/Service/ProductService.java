package com.Product.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.Product.Dao.ProductDao;
import com.Product.Entity.Product;


@Service
public class ProductService {
	@Autowired
	ProductDao ed;
	public String postAll(@RequestBody List<Product> p) {
		return ed.postAll(p);
	}
	
	public List<Product> getProduct() {
		return ed.getProduct();
	}
	

}
