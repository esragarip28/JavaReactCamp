package core.concretes;

import core.abstracts.GoogleAuthenticationService;
import entities.concretes.User;

public class GoogleAuthenticationManager implements GoogleAuthenticationService {
    public void registerWithGoogle() {
        System.out.println("registering has been successfully");
    }
}
