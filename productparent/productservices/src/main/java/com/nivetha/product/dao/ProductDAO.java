package com.nivetha.product.dao;

import com.nivetha.product.dto.Product;

public interface ProductDAO {

	//CRUD
	
	void create(Product product);
	Product read(int id);
	void update(Product product);
	void delete(int id);
}
