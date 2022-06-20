package com.zensar.spring.product.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.zensar.spring.product.demo.dto.*;
import com.zensar.spring.product.demo.entity.*;
import com.zensar.spring.product.demo.repository.*;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public ProductDto getProduct(int productId) {
		Product product = productRepository.findById(productId).get();
//ProductDto dto=mapToDto(product);
		return modelMapper.map(product, ProductDto.class);
//return dto;
	}

	@Override
	public List<ProductDto> getAllProducts(int pageNumber, int pageSize, String sortBy, Direction dir) {
// List<Product> listOfProducts = productRepository.findAll();
		List<ProductDto> listOfProductDto = new ArrayList<ProductDto>();
//Page<Product> findAll = productRepository
		Page<Product> findAll = productRepository.findAll(PageRequest.of(pageNumber, pageSize, dir, sortBy));
		List<Product> content = findAll.getContent();
		for (Product product : content) {
// listOfProductDto.add(mapToDto(product));
			listOfProductDto.add(modelMapper.map(product, ProductDto.class));
		}
		return listOfProductDto;
	}

	@Override
	public ProductDto insertProduct(ProductDto productDto) {
// Product product = mapToEntity(productDto);
		Product product = modelMapper.map(productDto, Product.class);
		Product insertedProduct = productRepository.save(product);
// ProductDto mapToDto = mapToDto(insertedProduct);
		return modelMapper.map(insertedProduct, ProductDto.class);
// return mapToDto;
	}

	@Override
	public void deleteProduct(int productId) {
		productRepository.deleteById(productId);

	}

	@Override
	public void updateProduct(int productId, ProductDto productDto) {
// Product product = mapToEntity(productDto);
		Product product = modelMapper.map(productDto, Product.class);
		productRepository.save(product);

	}

	@Override
	public List<ProductDto> getByProductName(String productName) {
		List<ProductDto> productDtos = new ArrayList<>();
		List<Product> products = productRepository.test(productName);
		for (Product product : products)
			productDtos.add(modelMapper.map(product, ProductDto.class));
		return productDtos;
	}

	@Override
	public List<ProductDto> getByProductNameAndProductPrice(String productName, int productPrice) {
		List<ProductDto> productDtos = new ArrayList<>();
		List<Product> products = productRepository.test1(productName, productPrice);
		for (Product product : products)
			productDtos.add(modelMapper.map(product, ProductDto.class));
		return productDtos;
	}
}
