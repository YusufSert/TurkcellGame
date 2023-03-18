import java.util.Date;

public class UserService {
    public static boolean registerCustomer(String firstName, String lastName, String id, Date date){
        Customer test = new Customer("123456789", "Yusuf Can", "Sert", new Date(1999, 1, 8),0.f);
        if(AuthService.authorize(test)) {
            System.out.println("Registered Successfully !");
            return true;
        }
        System.out.println("Not authorized!");
        return false;
    }

    public static User update(User usr, String firstName, String lastName, Date birthDate){
        usr.setFirstName(firstName);
        usr.setLastName(lastName);
        usr.setBirthDate(birthDate);
        return usr;
    }


}
