package interfaceAbstractDemo.Adapter;

import java.rmi.RemoteException;

import interfaceAbstractDemo.Abstract.CustomerCheckService;
import interfaceAbstractDemo.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkPerson(Customer customer) {
		
		KPSPublicSoap soapClient = new KPSPublicSoapProxy();
        boolean result = false;
          try {
              result = soapClient.TCKimlikNoDogrula(Long.parseLong(customer.getNationaltyId()), customer.getFirstName(), customer.getLastName(), customer.getDateOfBirth().getYear());
          } catch (NumberFormatException e) {
               e.printStackTrace();
          } catch (RemoteException e) {
               e.printStackTrace();
          }
         return result;
	}
	
}
