package ödev;

import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Concrete.NeroCustomerManager;
import Entities.Customer;
import Abstract.IEntity;
import Adapters.MerniceServiceAdapter;
import Abstract.ICustomerService;
import Concrete.StarbucksCustomerManager;



public class Main {

	public static void main(String[] args) {
		
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MerniceServiceAdapter());
		customerManager.Save(new Customer (LocalDate.of(2001, 02, 01) ,  "Emin",  "Palaz",  "12349760866"));
		
		
		
		
		
		
		
		
		
		
	}

}
