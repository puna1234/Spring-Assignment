package com.zensar.spring.product.demo.services;

import java.util.List;
import org.springframework.data.domain.Sort.Direction;
import com.zensar.spring.product.demo.Dto.*;

public interface ProductService {
	public ProductDto getProduct(int productId);

	public List<ProductDto> getAllProducts(int pageNumber, int pageSize, String sortBy, Direction dir);

	public ProductDto insertProduct(ProductDto product);

	public void deleteProduct(int couponId);

	public void updateProduct(int couponId, ProductDto product);

	List<ProductDto> getByProductName(String productName);

	List<ProductDto> getByProductNameAndProductPrice(String productName, int productPrice);
}
