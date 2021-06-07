package Adapters;


import Abstract.ICustomerCheckService;
import Entities.Customer;

public class MernisServiceAdapter implements ICustomerCheckService {

	public boolean checkIfRealPerson(Customer customer) {

		return true;
	}

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}

}


