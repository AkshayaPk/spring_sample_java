package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.pluralsight.model.Customer;

@Repository
public class HibernateCustomerRespositoryImpl implements CustomerRepository {

	@Value("${dbUsername}")
	private String dbUsername;
	/* (non-Javadoc)
	 * @see com.pluralsight.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		
		System.out.println(dbUsername);
		List<Customer> customers = new ArrayList<>();
		Customer customer = new Customer();
		customer.setFirstName("Bryan");
		customer.setLastName("Hansen");
		customers.add(customer);
		return customers;
	}
}
