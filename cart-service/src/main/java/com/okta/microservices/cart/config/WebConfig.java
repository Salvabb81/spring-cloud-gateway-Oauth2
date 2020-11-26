package com.okta.microservices.cart.config;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.zalando.jackson.datatype.money.MoneyModule;

public class WebConfig implements WebMvcConfigurer {

	@Bean
	public MoneyModule moneyModule() {
		return new MoneyModule().withDefaultFormatting();
	}

}
