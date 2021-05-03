package homework;

import java.rmi.RemoteException;

public class Main {

	public static void main(String[] args) throws RemoteException{

		CustomerManager customerManager = new NeroCustomerManager();
		CustomerManager customerManager2 = new StarbucksCustomerManager(new MernisServiceAdapter());
		Customer customer = new Customer(1, "Ege", "Aytaç", 2000, "11111111111");
		Customer customer3 = new Customer(3, "Serhat", "Dokumacý", 1999, "11111111111");
		customerManager.save(customer);
		customerManager.save(customer3);
		Customer customer2 = new Customer(2, "Serhat", "Dokumacý", 1999, "35011220970");
		customerManager2.save(customer2);
	
		
	}

}
