package interfaces;

public class CustomerManager {
    //dependency injection
    private Logger loggers[];

    public CustomerManager(Logger[] loggers) {
        this.loggers = loggers;
    }

    //loosely - tightly coupled
    public void add(Customer customer){
        System.out.println("customer is added :"+customer.getFirstName());
        //Utils utils=new Utils();
        //utils.runLoggers(this.loggers,customer.getFirstName()+" is logged");
        //utils in methodunu static yaptıgımız icin yukarıdaki seye gerek kalmadı
        Utils.runLoggers(this.loggers,customer.getLastName()+" is added");
        //yukarıdaki gibi yaptıgımzda utils bir tane otomatik new leyecek kendini . ve biz bu referansı kullanacagız

         }

    public void delete(Customer customer){
        System.out.println("customer is deleted :"+customer.getFirstName());
        Utils.runLoggers(this.loggers,customer.getLastName()+" is deleted");


    }
}
