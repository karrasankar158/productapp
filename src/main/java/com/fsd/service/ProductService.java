package com.fsd.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fsd.model.Product;

@Service
public class ProductService {
	
	public List<Product> getAllProducts(){  
		
		
		
		
		
		return List.of(new Product(101,"Apple",1000000L), 
				             new Product(102,"Sony",1500000L));
		
	}

}
