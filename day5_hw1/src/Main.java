import business.concretes.LoginManager;
import business.concretes.UserManager;
import core.concretes.GoogleAuthenticationManager;
import core.concretes.ValidationServiceManager;
import entities.concretes.User;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        User user=new User(1,"esra","garip","esra@gmail.com","123456");
        User user1=new User(2,"halil","garip","halil@gmail.com","123456");
        User user2=new User(2,"tugba","garip","tugba@gmail.com","123456");
        List<User> userList=new ArrayList<User>();
        userList.add(user);
        userList.add(user1);
        userList.add(user2);
        User user3=new User(4,"evren","senem","senem@gmail.com","147777");


        UserManager userManager=new UserManager(new ValidationServiceManager(),new GoogleAuthenticationManager());
        userManager.register(user,userList);
        userManager.register(user3,userList);

        userManager.registerWithGoogle();

        System.out.println("*****************************************************");
        LoginManager loginManager=new LoginManager();
        boolean isLogin=loginManager.login(user3,userList);
        if (isLogin){
            System.out.println("login successfully");
        }
        else System.out.println("login not successfully");
        User user4=new User(5,"a","bc","a@gmail.com","788888888");
        userManager.register(user4,userList);
    }
}
