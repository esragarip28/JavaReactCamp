package core.concretes;

import core.abstracts.ValidationService;
import entities.concretes.User;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationServiceManager implements ValidationService {


    public boolean emailCheck(User user) {
        String regex="^([\\w-\\.]+){1,64}@([\\w&&[^_]]+){2,255}(.[a-z]{2,3})+$|^$";
        Matcher matcher = Pattern.compile(regex, Pattern.CASE_INSENSITIVE).matcher(user.getEmail());
        if (matcher.matches()) return true;
        else return false;
    }

    public boolean emailRepetitionCheck(User user, List<User> userList) {
        if (userList.size() == 0) return true;
        else {
            for (User user1 : userList) {
                if (user1.getEmail()==user.getEmail()) return false;
            }
        }
        return true;
    }

    public boolean nameCheck(User user) {
        if (user.getName().length()>=2) return true;
        return false;
    }

    public boolean surnameCheck(User user) {
        if (user.getSurname().length()>=2) return true;
        return false;
    }

    public boolean passwordCheck(User user) {
        if (user.getPassword().length()>=6) return true;
        return false;
    }
}
