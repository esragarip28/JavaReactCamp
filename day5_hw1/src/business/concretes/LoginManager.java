package business.concretes;

import business.abstracts.LoginService;
import entities.concretes.User;

import java.util.List;


public class LoginManager implements LoginService {

    public boolean login(User user, List<User> userList) {
        for (User user1 : userList){
            if (user.getEmail().equals(user1.getEmail()) && user.getPassword().equals(user1.getPassword())){
                return true;
            }
        }

        return false;
    }
}
