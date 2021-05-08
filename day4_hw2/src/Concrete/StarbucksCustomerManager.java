package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Abstract.ICustomerService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {


    private ICustomerCheckService customerCheckService;
    public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }


    @Override
    public void Save(Customer customer) throws Exception {

     if (customerCheckService.checkIfRealPerson(customer)){
         super.Save(customer);
     }
     else throw new Exception("not a valid person");
    }
}


