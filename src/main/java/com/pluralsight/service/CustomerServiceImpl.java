package com.pluralsight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepository customerRepository;
	
	public CustomerServiceImpl()
	{
		
	}

	/**
	 * The below code is for constructor injection
	 * @param customerRepository
	 */
	public CustomerServiceImpl(CustomerRepository customerRepository)
	{
		System.out.println("Constructor");
	this.customerRepository=customerRepository;	
	}
	
	/**
	 * The below code is for a setter injection
	 * @param customerRepository
	 */
	@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("Setter");
		this.customerRepository = customerRepository;
	}

	/* (non-Javadoc)
	 * @see com.pluralsight.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}
