package interfaces;

public class MySqlCustomerDal implements ICustomerDal{
    //dal: shortage of data access layer
    @Override
    public void add() {
        System.out.println("data has been recorded");
    }
}
