package com.zensar.coupon.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zensar.coupon.demo.entity.Coupon;



public interface CouponRepository extends JpaRepository<Coupon, Integer> {

}