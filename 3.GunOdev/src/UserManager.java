public class UserManager {

    public void printEmail(User user) {
        System.out.println(user.getEmail());
    }

    public void printALlEmail (User[] users) {
        for (User user : users) {
            printEmail(user);
        }
    }

}