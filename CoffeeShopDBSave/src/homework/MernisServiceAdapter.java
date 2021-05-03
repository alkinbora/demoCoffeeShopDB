package homework;

import java.rmi.RemoteException;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;


public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		boolean result = false;
		try {
			return kpsPublic.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),customer.getFirstName(),customer.getLastName(),customer.getDateOfBirth());

		}catch(NumberFormatException e){
			
		} catch(RemoteException e) {
			
		}
		return result;
	}

}
