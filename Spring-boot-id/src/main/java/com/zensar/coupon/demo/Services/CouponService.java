package com.zensar.coupon.demo.Services;

import java.util.List;

import com.zensar.coupon.demo.Dto.CouponDto;



public interface CouponService {
	public CouponDto getCoupon(int couponId);

	public List<CouponDto> getAllCoupon();

	public CouponDto insertCoupon(CouponDto couponDto);

	public void updateCoupon(int couponId, CouponDto couponDto);

	public void deleteCoupon(int couponId);
}