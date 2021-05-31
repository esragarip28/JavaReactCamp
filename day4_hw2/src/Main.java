import Abstract.BaseCustomerManager;
import Adapter.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {
    public static void main(String[] args) throws Exception {

    BaseCustomerManager customerManager=new NeroCustomerManager();
        try {
            customerManager.Save(new Customer("esra","garip",1998,"24778745621"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        BaseCustomerManager customerManager2=new StarbucksCustomerManager(new MernisServiceAdapter());
        customerManager2.Save(new Customer("esra","garip",1998,"12345678850"));


    }
}
