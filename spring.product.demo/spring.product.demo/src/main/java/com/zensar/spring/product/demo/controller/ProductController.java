package com.zensar.spring.product.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.spring.product.demo.services.*;
import com.zensar.spring.product.demo.Dto.*;

@RestController
@RequestMapping(value = "/product-api", produces = { MediaType.APPLICATION_JSON_VALUE,
		MediaType.APPLICATION_XML_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE,
				MediaType.APPLICATION_XML_VALUE })
public class ProductController {
	@Autowired
	private ProductService productService; // @RequestMapping("/products/{productId}")

	@GetMapping(value = "/products/{productId}")
	public ResponseEntity<ProductDto> getCoupon(@PathVariable("productId") int productId) {
		return new ResponseEntity<ProductDto>(productService.getProduct(productId), HttpStatus.OK);
	}

//http://localhost:1111/product-api/products?pageNumber=0&pageSize=5&sortBy=productName&dir=DESC
// @RequestMapping("/products")
	@GetMapping(value = { "/products", "/listOfProducts" })
	public ResponseEntity<List<ProductDto>> getAllProducts(
			@RequestParam(value = "pageNumber", required = false, defaultValue = "0") int pageNumber,
			@RequestParam(value = "pageSize", required = false, defaultValue = "5") int pageSize,
			@RequestParam(value = "sortBy", required = false, defaultValue = "productId") String sortBy,
			@RequestParam(value = "dir", required = false, defaultValue = "ASC") Direction dir) {
		return new ResponseEntity<List<ProductDto>>(productService.getAllProducts(pageNumber, pageSize, sortBy, dir),
				HttpStatus.OK);
	}

// @RequestMapping(value="/products", method=RequestMethod.POST)
	@PostMapping(value = "/products")
	public ResponseEntity<ProductDto> insertProduct(@RequestBody ProductDto productDto) {
		return new ResponseEntity<ProductDto>(productService.insertProduct(productDto), HttpStatus.CREATED);
	}

// @RequestMapping(value="/products/{productId}", method=RequestMethod.DELETE)
	@DeleteMapping("/products/{productId}")
	public ResponseEntity<String> deleteProduct(@PathVariable("productId") int productId) {
		productService.deleteProduct(productId);
		return new ResponseEntity<String>("Product Deleted Successfully", HttpStatus.OK);
	}

// @RequestMapping(value="/products/{productId}", method=RequestMethod.PUT)
	@PutMapping(value = "/products/{productId}")
	public ResponseEntity<String> updateProduct(@PathVariable("productId") int productId,
			@RequestBody ProductDto productDto) {
		productService.updateProduct(productId, productDto);
		return new ResponseEntity<String>("Product Updated Successfully", HttpStatus.OK);
	}

	@GetMapping("/products/productName/{productName}")
	public ResponseEntity<List<ProductDto>> getByProductName(@PathVariable("productName") String productName) {
		return new ResponseEntity<List<ProductDto>>(productService.getByProductName(productName), HttpStatus.OK);
	}

	@GetMapping("/products/{productName}/{productPrice}")
	public ResponseEntity<List<ProductDto>> getByProductNameAndProductPrice(@PathVariable String productName,
			@PathVariable int productPrice) {
		return new ResponseEntity<List<ProductDto>>(
				productService.getByProductNameAndProductPrice(productName, productPrice), HttpStatus.OK);
	}
}
