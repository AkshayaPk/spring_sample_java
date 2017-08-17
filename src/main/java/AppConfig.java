import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.pluralsight.repository.CustomerRepository;
import com.pluralsight.repository.HibernateCustomerRespositoryImpl;
import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;

@Configuration
@ComponentScan({"com.pluralsight"})
@PropertySource("app.properties")
public class AppConfig {
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer()
	{
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	/**
	 * We are going to take this one step further and take off this bean named customerService
	 * and we are going to go to CustomerServiceImpl and add a stereotype annotation called as 
	 * @Service.
	 */

//	@Bean(name="customerService")
//	public CustomerService getCustomerService()
//	{
//		//CustomerServiceImpl customerService=new CustomerServiceImpl(getCustomerRepository());// Constructor Injection passing CustomerRepository as a argument
//		CustomerServiceImpl customerService=new CustomerServiceImpl();
//		//customerService.setCustomerRepository(getCustomerRepository()); // Used for setter injection
//		return customerService;
//	}
	
	/**
	 * Commenting out the customerRepository Bean and adding a stereotype annotation @Repository
	 * to the repository tier class called HibernateCustomerRepositoryImpl
	 */
//	@Bean(name="customerRepository")
//	public CustomerRepository getCustomerRepository()
//	{
//		return new HibernateCustomerRespositoryImpl();
//	}
}
