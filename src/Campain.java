public class Campain implements Appliable {
    private String name;
    private Float amount;

    Campain(String name, Float price) {
        this.name = name;
        this.amount = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    @Override
    public boolean isGeneral() {
        return false;
    }

    @Override
    public float hasPrice() {
        return 0;
    }
}
