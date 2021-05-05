package inheritance;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager=new CustomerManager();
        IndividualCustomer esra=new IndividualCustomer();
        esra.customerNumber="12345";

        CorporateCustomer ACompany =new CorporateCustomer();
        ACompany.customerNumber="35789";

        //customerManager.add(esra);
        //customerManager.add(ACompany);

       Customer customer[]={esra,ACompany};
       customerManager.AddMultiple(customer);


    }

}
