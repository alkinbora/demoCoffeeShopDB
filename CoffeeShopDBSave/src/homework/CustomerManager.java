package homework;

public abstract class CustomerManager implements CustomerService{

	@Override
	public void save(Customer customer) {
		System.out.println("Saved to DB : " + customer.firstName);
		
	}

}
