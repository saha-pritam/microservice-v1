package com.pritam.microservices.v1.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pritam.microservices.v1.limitsservice.component.Configuration;
import com.pritam.microservices.v1.limitsservice.model.LimitConfiguration;


@RestController
@RefreshScope
public class LimitsConfigurationController {
	
	@Autowired
	private Configuration configuration;

	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitConfiguration() {
		return new LimitConfiguration(configuration.getMinimum(),configuration.getMaximum());
	}
}
