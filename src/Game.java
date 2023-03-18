import java.util.ArrayList;

public class Game {
    private String name;
    private float price;

    public Game(String name, Float price) {
        this.name = name;
        this.price = price;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
