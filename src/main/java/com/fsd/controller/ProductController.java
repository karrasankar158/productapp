package com.fsd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fsd.model.Product;
import com.fsd.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/all")
	public ResponseEntity<List<Product>> getAllProducts(){
		List<Product> allProducts=productService.getAllProducts();
		return new ResponseEntity<>(allProducts,HttpStatus.OK);
	}

}
