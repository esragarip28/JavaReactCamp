package inheritance;

public class CustomerManager {

    //Base class onu extends eden classların referanslarını tutabilir o yuzden
    //biz Customer yerine individualcustomer vaya corporatecustomer verebiliriz.
    public void add(Customer customer){
        System.out.println(customer.customerNumber+" kaydedildi...");

    }

    //bulk insert
    public void AddMultiple(Customer customer[]){
        for(Customer customer1 : customer){
            add(customer1);
        }
    }
}
