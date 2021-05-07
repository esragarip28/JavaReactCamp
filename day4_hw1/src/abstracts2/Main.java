package abstracts2;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager=new CustomerManager();
        customerManager.databaseManager=new SqlServerDatabaseManager();
        customerManager.getCustomers();
        System.out.println("______________________________________");
        customerManager.databaseManager=new MysSqlDatabaseManager();
        customerManager.getCustomers();
    }
}
