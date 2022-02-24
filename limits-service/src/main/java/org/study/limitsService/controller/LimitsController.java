package org.study.limitsService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.study.limitsService.bean.Limits;
import org.study.limitsService.configuration.Configuration;

@RestController
public class LimitsController {
	@Autowired
	private Configuration configuration;
	@GetMapping("/limits")
public Limits reteriveLimits() {
	//return new Limits(1,200);
		return new Limits(configuration.getMinimum(),configuration.getMaximum());
	
}
}
