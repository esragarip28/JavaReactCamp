package business.concretes;

import business.abstracts.UserService;
import core.abstracts.GoogleAuthenticationService;
import core.abstracts.ValidationService;
import entities.concretes.User;

import java.util.List;

public class UserManager implements UserService {
    private ValidationService validationService;
    private GoogleAuthenticationService googleAuthenticationService;

    public UserManager(ValidationService validationService,GoogleAuthenticationService googleAuthenticationService) {

        this.validationService = validationService;
        this.googleAuthenticationService=googleAuthenticationService;
    }


    public void register(User user, List<User> userList) {
       if (! validationService.nameCheck(user)){
           System.out.println("not valid name");
           return;
       }
       if (!validationService.surnameCheck(user)){
           System.out.println("not valid name");
           return;
       }
       if (!validationService.emailCheck(user)){
           System.out.println("not valid email");
           return;
       }
       if (!validationService.emailRepetitionCheck(user,userList)){
            System.out.println("the email have been used already");
            return;
        }
        if (!validationService.passwordCheck(user)){
            System.out.println("not valid password");
            return;
        }

        System.out.println("register process has been successfully");
    }

    public void delete(User user) {

    }

    public void update(User user) {

    }

    public void sendVerificationEmail() {
        System.out.println("Please verify your email");
    }

    public void registerWithGoogle() {
       googleAuthenticationService.registerWithGoogle();
       sendVerificationEmail();

    }
}
