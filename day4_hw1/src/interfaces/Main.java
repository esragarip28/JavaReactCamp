package interfaces;

public class Main {
    public static void main(String[] args) {
        ICustomerDal customerDal=new OracleCustomerDal();
        customerDal.add();
        ICustomerDal customerDal1=new MySqlCustomerDal();
        customerDal.add();
        CustomerManager customerManager=new CustomerManager(new OracleCustomerDal());
        customerManager.add();

        /*
        we can implements interface as far as you want
         */
    }
}
