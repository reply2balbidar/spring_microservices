package com.zensar.service;

import com.zensar.entity.Coupon;

public interface CouponService {

	public Coupon createCoupon(Coupon coupon);

	public Coupon getCoupon(String couponCode);
}
