package com.zensar.spring.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
//@NamedQueries(value = { @NamedQuery(name = "Coupon.test", query = "from Coupon c where c.couponCode=?1"),
//		@NamedQuery(name = "Coupon.test1", query = "from Coupon c where c.couponCode=?1 and c.couponExpDate=?2") })
//
//@NamedNativeQueries(value = {
// @NamedNativeQuery(name = "Coupon.test", query = "select * from coupon where
// coupon_code=?1", resultClass = Coupon.class),
// @NamedNativeQuery(name = "Coupon.test1", query = "select * from coupon where
// coupon_code=?1 and coupon_exp_date=?2", resultClass = Coupon.class) })
public class Coupon {
	@Id
	private int couponId;
	private String couponCode;
	private String couponExpDate;

	public Coupon() {
		super();
	}

	public Coupon(int couponId, String couponCode, String couponExpDate) {
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
		return "Coupon [couponId=" + couponId + ", couponCode=" + couponCode + ", couponExpDate=" + couponExpDate + "]";
	}

}