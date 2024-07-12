package com.Product.Controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Product.Entity.Product;
import com.Product.Service.ProductService;

@RestController
public class ProductController {
	@Autowired
	ProductService es;
	@PostMapping (value="/PostProductAll")
	public String postAll(@RequestBody List<Product> p) {
		return es.postAll(p);
	}
	
	@GetMapping (value="/GetProductAll")
	public List<Product> getProduct() {
		return es.getProduct();
	}
	
	Logger log= Logger.getLogger(ProductController.class);
	@GetMapping(value="getting")
	public List<Product> GetProductAll() {
		PropertyConfigurator.configure("Sample_File1");
		log.info(es.getProduct());
		return es.getProduct();
	}
	
	Logger log1= Logger.getLogger(ProductController.class);
	@PostMapping (value="/Posting")
	public String postAll1(@RequestBody List<Product> p) {
		PropertyConfigurator.configure("Sample_File1");
		log.info(es.postAll(p));
		return es.postAll(p);
	}
	

	

}
