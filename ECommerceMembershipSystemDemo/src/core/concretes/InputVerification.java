package core.concretes;

import core.abstracts.InputVerificationService;
import entities.concretes.User;
import java.util.regex.Pattern;

public class InputVerification implements InputVerificationService {



    public boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." +
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }


    public boolean isValidPassword(String password) {
        if (password == null || password.length() < 6) {
            return false;
        }

        return true;
    }


    public boolean isValidString(String name) {

        if (name == null || name.length() < 2) {
            return false;
        }
        for (char c : name.toCharArray()) {
            if (Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }


    @Override
    public boolean isValid(User user) {
        if(!isValidEmail(user.geteMail())){
            System.out.println("Yanlış email formatı. lütfen kontrol edin.");
            return false;

        }

        if(!isValidString(user.getFirstName())){
            System.out.println("Yanlış isim formatı --> en az 2 karakter girmelisiniz ve sayı içermemeli!");
            return false;

        }
        if(!isValidString(user.getLastName())){
            System.out.println("Yanlış soyadı formatı --> en az 2 karakter girmelisiniz ve sayı içermemeli!");
            return false;

        }
        if(!isValidPassword(user.getPassword())){
            System.out.println("Yanlış parola formatı --> en az 6 karakter girmelisiniz!");
            return false;

        }return true;

    }
}

    

