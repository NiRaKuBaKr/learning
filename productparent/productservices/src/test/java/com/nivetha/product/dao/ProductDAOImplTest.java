package com.nivetha.product.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.nivetha.product.dto.Product;

public class ProductDAOImplTest {

	@Test
	public void createShouldCreateAProduct() {

		ProductDAO dao = new ProductDAOImpl();
		Product product = new Product();
		product.setId(1);
		product.setName("OnePlus6");
		product.setDescription("A flagship SmartPhone");
		product.setPrice(40000.00F);
		
		dao.create(product);
		Product result = dao.read(product.getId());
		
		assertNotNull(result);
		assertEquals("OnePlus6", product.getName());
	}

}
