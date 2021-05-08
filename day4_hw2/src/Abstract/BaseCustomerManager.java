package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService {


    @Override
    public void Save(Customer customer) throws Exception {
        System.out.println("data saved to database: "+customer.getFirstName());

    }
}
