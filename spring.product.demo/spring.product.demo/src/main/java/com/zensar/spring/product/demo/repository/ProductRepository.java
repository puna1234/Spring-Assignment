package com.zensar.spring.product.demo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.zensar.spring.product.demo.entity.*;

public interface ProductRepository extends JpaRepository<Product, Integer> { // List<Product> findByProducId(int
																				// productId);
	List<Product> findByProductName(String productName);

	List<Product> findByProductNameAndProductPrice(String productName, int procuctPrice);

//List<Product> test( String productName);
//@Query(value = "from Product p where p.productName=:name")
	@Query(value = "select * from product p where p.product_name=:name", nativeQuery = true)
	List<Product> test(@Param("name") String ProductName); // List<Product> test1( String productName,int productPrice);
//@Query(value = "from Product p where p.productName=:name and p.productPrice=:price")

	@Query(value = "select * from product p where p.product_name=:name and p.product_price=:price", nativeQuery = true)
	List<Product> test1(@Param("name") String productName, @Param("price") int productPrice);
}
