package com.zensar.spring.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.zensar.spring.demo.entity.Coupon;



public interface CouponRepository extends JpaRepository<Coupon, Integer> {

	@Query(value = "from Coupon c where c.couponCode=:code")
	List<Coupon> test(@Param("code") String couponCode);

	@Query(value = "from Coupon c where c.couponCode=:code and c.couponExpDate=:expdate")
	List<Coupon> test1(@Param("code") String couponCode, @Param("expdate") String couponExpDate);

}