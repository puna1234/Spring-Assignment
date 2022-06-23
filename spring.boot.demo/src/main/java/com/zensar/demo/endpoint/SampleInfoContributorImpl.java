package com.zensar.demo.endpoint;

import java.util.HashMap;
import java.util.Map;
import org.springframework.boot.actuate.info.Info.Builder;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

@Component
public class SampleInfoContributorImpl implements InfoContributor {
	@Override
	public void contribute(Builder builder) {
		Map<String, Object> studentDetails = new HashMap<String, Object>();
		studentDetails.put("CreatedBy", "Punam");
		studentDetails.put("ModifiedOn", "22June22");
//builder.withDetails(studentDetails);
		builder.withDetail("Student", studentDetails);
	}
}
