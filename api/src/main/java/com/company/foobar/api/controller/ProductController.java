package com.company.foobar.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.foobar.api.model.Product;
import com.company.foobar.api.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@Value("${s3.bucket}")
	private String bucketName;
	
	@GetMapping("")
	public List<Product> getProducts() {
		System.out.println("BucketName " + bucketName);
		return productService.getProducts();
	}
}
