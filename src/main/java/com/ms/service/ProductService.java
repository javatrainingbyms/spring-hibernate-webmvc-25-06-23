package com.ms.service;

import java.util.List;

import com.ms.entity.Product;

public interface ProductService {
	public Product save(Product product);
	public Product update(Product product);
	public Product delete(int code);
	public Product findById(int code);
	public List<Product> findAll();
	public List<Product> findByBrand(String brand);
	//..
	//..
}
