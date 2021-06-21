package com.zensar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.entity.Coupon;
import com.zensar.repository.CouponRepository;

@Service
public class CouponServiceImpl implements CouponService{
	
	@Autowired
	private CouponRepository couponRepository;

	@Override
	public Coupon createCoupon(Coupon coupon) {

		return couponRepository.save(coupon);
	}

	@Override
	public Coupon getCoupon(String couponCode) {

		return couponRepository.findByCouponCode(couponCode);
	}

	
}
