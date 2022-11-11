package com.example.authenticationDemo.authDemo;

import com.example.authenticationDemo.authDemo.filter.JwtFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerDataApplication {

	public static void main(String[] args) {

		SpringApplication.run(CustomerDataApplication.class, args);
	}

	@Bean
	public FilterRegistrationBean jwtFilter()
	{
		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
		filterRegistrationBean.setFilter(new JwtFilter());
		filterRegistrationBean.addUrlPatterns("/customerdata/v1/*");
		return filterRegistrationBean;

	}
}
