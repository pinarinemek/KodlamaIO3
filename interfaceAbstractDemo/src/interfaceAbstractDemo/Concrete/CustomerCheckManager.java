package interfaceAbstractDemo.Concrete;

import interfaceAbstractDemo.Abstract.CustomerCheckService;
import interfaceAbstractDemo.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkPerson(Customer customer) {
		return true;
	}

}
