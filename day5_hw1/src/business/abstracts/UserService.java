package business.abstracts;

import entities.concretes.User;

import java.util.List;

public interface UserService {
    void register(User user, List<User> userList);
    void delete(User user);
    void update(User user);
    void sendVerificationEmail();
    void registerWithGoogle();

}
