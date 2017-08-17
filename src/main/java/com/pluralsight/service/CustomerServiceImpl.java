package com.pluralsight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;

@Service
//@Scope("singleton") // Using the Singleton Scope to create only 1 instance.
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON) //Using the public static final String that is present within the Spring Framework
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
