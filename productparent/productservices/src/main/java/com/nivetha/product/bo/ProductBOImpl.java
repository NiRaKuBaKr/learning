package com.nivetha.product.bo;

import com.nivetha.product.dao.ProductDAO;
import com.nivetha.product.dto.Product;

public class ProductBOImpl implements ProductBO {

	private ProductDAO productDAO;
	
	@Override
	public void createProduct(Product product) {
		productDAO.create(product);
	}

	@Override
	public Product findProduct(int id) {
		return productDAO.read(id);
	}

	public ProductDAO getProductDAO() {
		return productDAO;
	}

	public void setProductDAO(ProductDAO productDAO) {
		this.productDAO = productDAO;
	}

}
