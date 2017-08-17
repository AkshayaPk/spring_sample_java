import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pluralsight.service.CustomerService;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CustomerService customerService = new CustomerServiceImpl();
		ApplicationContext appContext=new AnnotationConfigApplicationContext(AppConfig.class);
		CustomerService customerService=appContext.getBean(CustomerService.class);
		System.out.println(customerService);
		/**
		 * Using the same CustomerService class to create another instance
		 * called customerService1 for Singleton example
		 * When we have the output - we get two object addresses as the same
		 * even though the instances we named differently.
		 */
		CustomerService customerService1=appContext.getBean(CustomerService.class);
		System.out.println(customerService1);
		System.out.println(customerService.findAll().get(0).getFirstName());
	}

}
