package com.zensar.coupon.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.zensar.coupon.demo.Services.*;
import com.zensar.coupon.demo.Dto.*;
import com.zensar.coupon.demo.entity.Coupon;

@RestController
@RequestMapping(value = "/coupon-api", produces = { MediaType.APPLICATION_JSON_VALUE,
		MediaType.APPLICATION_XML_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE,
				MediaType.APPLICATION_XML_VALUE })
public class CouponController {
	@Autowired
	private CouponService couponService;

//	@GetMapping(value = "/coupon/{couponId}",produces = { MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE })
	@GetMapping(value = "/coupon/{couponId}")
	// public CouponDto getCoupon(@PathVariable("couponId") int CouponId) {
	public ResponseEntity<CouponDto> getCoupon(@PathVariable("couponId") int CouponId) {
		// return couponService.getCoupon(CouponId);
		return new ResponseEntity<CouponDto>(couponService.getCoupon(CouponId), HttpStatus.OK);
	}

//	@GetMapping(value = "/coupons",produces = { MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE })
	@GetMapping(value = "/coupons/")
	// public List<CouponDto> getCoupons() {
	public ResponseEntity<List<CouponDto>> getCoupons(
			@RequestParam(value = "pageNumber", required = false, defaultValue = "0") int pageNumber,
			@RequestParam(value = "pageSize", required = false, defaultValue = "3") int pageSize) {
		// return couponService.getCoupons();
		return new ResponseEntity<List<CouponDto>>(couponService.getCoupons(pageNumber, pageSize), HttpStatus.OK);
	}

//	@PostMapping(value = "/coupons",consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	@PostMapping(value = "/coupons")
	// public CouponDto insertCoupon(@RequestBody CouponDto couponDto) {
	public ResponseEntity<CouponDto> insertCoupon(@RequestBody CouponDto couponDto) {
		// return couponService.insertCoupon(couponDto);
		return new ResponseEntity<CouponDto>(couponService.insertCoupon(couponDto), HttpStatus.CREATED);
	}

//	@PutMapping(value = "coupons/{couponId}",consumes = { MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE })
	@PutMapping(value = "coupons/{couponId}")
	// public void updateCoupon(@PathVariable("couponId") int CouponId, @RequestBody
	// CouponDto couponDto) {
	public ResponseEntity<String> updateCoupon(@PathVariable("couponId") int CouponId,
			@RequestBody CouponDto couponDto) {
		couponService.updateCoupon(CouponId, couponDto);
		return new ResponseEntity<String>("Coupon updated Succesfully", HttpStatus.OK);

	}

	@DeleteMapping("coupons/{couponId}")
	// public void deleteCoupon(@PathVariable("couponId") int CouponId) {
	public ResponseEntity<String> deleteCoupon(@PathVariable("couponId") int CouponId) {
		couponService.deleteCoupon(CouponId);
		return new ResponseEntity<String>("Coupon deleted Succesfully", HttpStatus.OK);
	}
}