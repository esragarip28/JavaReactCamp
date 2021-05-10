package Adapter;

import Abstract.ICustomerCheckService;
import Entities.Customer;

import mernisReference.VHSKPSPublicSoap;

public class MernisServiceAdapter implements ICustomerCheckService {
    @Override
    public Boolean checkIfRealPerson(Customer customer) {
        VHSKPSPublicSoap client=new VHSKPSPublicSoap();
        try {
             return client.TCKimlikNoDogrula(Long.valueOf(customer.getNationalityID()),customer.getFirstName(),customer.getLastName(),customer.getBirthYear());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
