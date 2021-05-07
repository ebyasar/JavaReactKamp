package business.concretes;

import business.abstracts.UserService;
import core.abstracts.InputVerificationService;
import core.abstracts.ValidatorService;
import dataAccess.abstracts.UserDaoService;
import entities.concretes.User;

public class UserManager implements UserService {

    InputVerificationService memberInformationValidation;
    UserDaoService userDaoService;
    ValidatorService validatorService;

    public UserManager(InputVerificationService memberInformationValidation,
                       UserDaoService userDaoService, ValidatorService validatorService) {
        this.memberInformationValidation = memberInformationValidation;
        this.userDaoService = userDaoService;
        this.validatorService = validatorService;

    }


    @Override
    public void register(User user) {
        if (!memberInformationValidation.isValid(user)) {
            System.out.println("Kullanıcı bilgileri yanlış formatta. Kayıt işlemi BAŞARISIZ!!!");
        } else if (!userDaoService.emailCheck(user)) {
            System.out.println("Bu email adresi daha önce alınmış ---> " + user.geteMail() + "\n" + "Kayıt işlemi BAŞARISIZ!!!");

        } else {
            userDaoService.add(user);
            validatorService.sendVarificationMail();
        }
    }

    @Override
    public void login(String email, String password) {
        if (userDaoService.loginByCheck(email, password)) {
            System.out.println("Giriş Başarılı.");
        } else {
            System.out.println("Kullanıcı adı yanlış veya kullanıcı yok. Giriş BAŞARISIZ!!!");
        }
    }
}
