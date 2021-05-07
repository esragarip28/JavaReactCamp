package abstracts2;

public class MysSqlDatabaseManager extends BaseDatabaseManager {
    @Override
    public void getData() {
        System.out.println("data has been got from MySql database");
    }
}
