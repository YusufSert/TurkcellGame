public class IndivudalCanpain extends Campain implements Appliable{


    String gameName;
    IndivudalCanpain(String name, Float price, String gameName) {
        super(name, price);
        this.gameName = gameName;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }
    @Override
    public boolean isGeneral() {
        return false;
    }

    @Override
    public float hasPrice() {
        return getAmount();
    }
}
