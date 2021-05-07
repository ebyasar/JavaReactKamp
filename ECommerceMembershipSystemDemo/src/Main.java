import business.abstracts.UserService;
import business.concretes.UserManager;
import core.concretes.EmailValidatorManager;
import core.concretes.JGoogleUserVerificationServiceAdepter;
import core.concretes.InputVerification;
import dataAccess.concretes.UserDao;
import entities.concretes.User;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("emir","Yaşar","emirbekir97@hotmail.com","123456");
        User user2 = new User("888Engin","Demiroğ","engindemirog@gmail.com","456654");
        User user3 = new User("Barış","Efecan","efecan.com","456982444");


        UserService userService = new UserManager(new InputVerification(), new UserDao(), new EmailValidatorManager());
        userService.register(user1);

        System.out.println("----------------------------------");

        userService.register(user1);

        System.out.println("----------------------------------");

        userService.register(user2);

        System.out.println("----------------------------------");

        userService.register(user3);

        System.out.println("----------------------------------");



        UserService userService2 = new UserManager(new JGoogleUserVerificationServiceAdepter(), new UserDao(), new EmailValidatorManager());
        userService2.register(user3);



        System.out.println("----------------------------------");

        userService.login("emirbekir97@hotmail.com", "123456"); // doğru girdiler

        System.out.println("----------------------------------");

        userService.login ("engindemiroğ@gmail.com", "56565655225215448"); // yanlış parola








    }
}

