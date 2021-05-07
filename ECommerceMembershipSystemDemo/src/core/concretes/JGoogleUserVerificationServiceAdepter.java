package core.concretes;

import JGoogleUserValid.JGoogleUserVerificationService;
import core.abstracts.InputVerificationService;
import entities.concretes.User;

public class JGoogleUserVerificationServiceAdepter implements InputVerificationService {


    @Override
    public boolean isValid(User user) {
        JGoogleUserVerificationService googleUserValid = new JGoogleUserVerificationService();
        return googleUserValid.isValid();
    }
}

