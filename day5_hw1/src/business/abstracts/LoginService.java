package business.abstracts;


import entities.concretes.User;

import java.util.List;

public interface LoginService {

    boolean login(User user, List<User> userList);

    

}
