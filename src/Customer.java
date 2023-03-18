import java.util.ArrayList;
import java.util.Date;

public class Customer extends User{
    Float balance;
    ArrayList<Game> library = new ArrayList<>();

    public Float getBalance() {
        return balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }

    public ArrayList<Game> getLibrary() {
        return library;
    }

    public void setLibrary(ArrayList<Game> library) {
        this.library = library;
    }

    Customer(String tcNo, String firstName, String lastName, Date birthDate, Float balance) {
        super(tcNo, firstName, lastName, birthDate);
        this.balance = balance;
    }
}
