package interfaceAbstractDemo.Concrete;

import interfaceAbstractDemo.Abstract.BaseCustomerManager;
import interfaceAbstractDemo.Abstract.CustomerCheckService;
import interfaceAbstractDemo.Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {
	
	CustomerCheckService customerCheckService ;
	
	public NeroCustomerManager(CustomerCheckService customerCheckService) {
		
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void save(Customer customer) {
		
		if(customerCheckService.checkPerson(customer)) {
			System.out.println("save to databse: "+ customer.getFirstName());
			super.save(customer);
		}
		else {
			System.out.println("don't save to database");
		}
		
		
	}

}
