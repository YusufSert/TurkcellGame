import java.util.ArrayList;
import java.util.Date;

public class AuthService {
    static ArrayList<User> accountList =  new ArrayList<>();
    User test1 = new User("123456789", "Yusuf Can", "Sert", new Date(1999, 1, 8));
    User test2 = new User("987654321", "Fethi Can", "Sert", new Date(1999, 1, 8));

    public static boolean authorize(User user) {
        return equals(user);
    }

    private static boolean equals(User user) {
        for(User usr : getAccountList()) {
            if(usr.getFirstName().equals(user.getFirstName()) && usr.getLastName().equals(user.getLastName()) && usr.getTcNo().equals(user.getTcNo())){
                return true;
            }
        }
        return false;
    }


    public static ArrayList<User> getAccountList() {
        return accountList;
    }


}
