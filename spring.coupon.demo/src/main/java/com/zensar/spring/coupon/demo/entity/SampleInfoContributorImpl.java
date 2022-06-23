package com.zensar.spring.coupon.demo.entity;

import java.util.HashMap;
import java.util.Map;
import org.springframework.boot.actuate.info.Info.Builder;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

@Component
public class SampleInfoContributorImpl implements InfoContributor {
	@Override
	public void contribute(Builder builder) {
		Map<String, Object> couponDetails = new HashMap<String, Object>();
		couponDetails.put("CreatedBy", "Punam");
		couponDetails.put("ModifiedOn", "22June22");
//builder.withDetails(couponDetails);
		builder.withDetail("Coupon", couponDetails);
	}
}
