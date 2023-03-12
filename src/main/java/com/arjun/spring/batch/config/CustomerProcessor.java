package com.arjun.spring.batch.config;

import org.springframework.batch.item.ItemProcessor;

import com.arjun.spring.batch.entity.Customer;

public class CustomerProcessor implements ItemProcessor<Customer, Customer>
{

	@Override
	public Customer process(Customer customer) throws Exception {
		return customer;
	}

}
