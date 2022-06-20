package com.zensar.spring.demo.Dto;

public class CouponDto {
	private int couponId;
	private String couponCode;
	private String couponExpDate;

	public CouponDto() {
		super();
	}

	public CouponDto(int couponId, String couponCode, String couponExpDate) {
		super();
		this.couponId = couponId;
		this.couponCode = couponCode;
		this.couponExpDate = couponExpDate;
	}

	public int getCouponId() {
		return couponId;
	}

	public void setCouponId(int couponId) {
		this.couponId = couponId;
	}

	public String getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public String getCouponExpDate() {
		return couponExpDate;
	}

	public void setCouponExpDate(String couponExpDate) {
		this.couponExpDate = couponExpDate;
	}

	@Override
	public String toString() {
		return "CouponDto [couponId=" + couponId + ", couponCode=" + couponCode + ", couponExpDate=" + couponExpDate
				+ "]";
	}

}