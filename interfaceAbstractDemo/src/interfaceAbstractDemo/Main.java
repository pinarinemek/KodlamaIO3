package interfaceAbstractDemo;

import java.util.Date;

import interfaceAbstractDemo.Abstract.BaseCustomerManager;
import interfaceAbstractDemo.Adapter.MernisServiceAdapter;
import interfaceAbstractDemo.Concrete.NeroCustomerManager;
import interfaceAbstractDemo.Concrete.StarbucksCustomerManager;
import interfaceAbstractDemo.Entities.Customer;

public class Main {

	public static void main(String[] args) {
		Customer realCustomer = new Customer(1,"Alpay","Özer","32983406432",new Date(2002,7,23));
        Customer fakeCustomer = new Customer(2,"Pýnar","Ýnemek","15206727224",new Date(2001,10,5));

        BaseCustomerManager neroCustomerManager = new NeroCustomerManager(new MernisServiceAdapter());
        //neroCustomerManager.save(realCustomer);
        neroCustomerManager.save(fakeCustomer);

        BaseCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
        starbucksCustomerManager.save(realCustomer);
       // starbucksCustomerManager.save(fakeCustomer);


	}

}
