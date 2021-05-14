package core.abstracts;

import entities.concretes.User;

import java.util.List;

public interface ValidationService {

    boolean emailCheck(User user);
    boolean emailRepetitionCheck(User user,List<User> userList);
    boolean nameCheck(User user);
    boolean surnameCheck(User user);
    boolean passwordCheck(User user);

}
