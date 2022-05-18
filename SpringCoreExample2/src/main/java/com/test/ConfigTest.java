package com.test;

import org.springframework.context.annotation.Bean;

public class ConfigTest {

	Address ad=new Address("Ujjain","M.P.","INDIA");
	Customer c=new Customer(101,"Radhika","radhika@gmail.com",ad);
	
	
	
	@Bean
	public Customer getCustomer()
	{
		return c;
	}
	
	@Bean
	public Address getAddress()
	{
		return ad;
	}
	
	@Bean
	public HelloTest getObj()
	{
		return new HelloTest();
	}
	
}
