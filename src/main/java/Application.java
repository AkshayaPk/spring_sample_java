import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pluralsight.service.CustomerService;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CustomerService customerService = new CustomerServiceImpl();
		ApplicationContext appContext=new AnnotationConfigApplicationContext(AppConfig.class);
		CustomerService customerService=appContext.getBean(CustomerService.class);
		System.out.println(customerService.findAll().get(0).getFirstName());
	}

}
