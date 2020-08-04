package com.company.foobar.api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.company.foobar.api.model.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Override
	public List<Product> getProducts() {
		List<Product> products = new ArrayList<Product>();
		products.add(new Product(new Long(1), "P1", 100));
		products.add(new Product(new Long(2), "P2", 120));
		products.add(new Product(new Long(3), "P3", 150));
		return products;
	}

}
