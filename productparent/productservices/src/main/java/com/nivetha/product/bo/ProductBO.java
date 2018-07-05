package com.nivetha.product.bo;

import com.nivetha.product.dto.Product;

public interface ProductBO {

	void createProduct(Product product);
	Product findProduct(int id);
}
