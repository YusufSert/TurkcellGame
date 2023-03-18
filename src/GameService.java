import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GameService {
    ArrayList<Game> games = new ArrayList<>();

    public void add(String name, Float price) {
        Game game = new Game(name, price);
        games.add(game);
    }

    public boolean remove(Game g) {
        for(Game game : games) {
            if(game.getName().equals(g.getName())){
                return true;
            }
        }
        return false;
    }

    public Game update(Game game, String name, Float price) {
        game.setName(name);
        game.setPrice(price);
        return game;
    }

    public boolean sell(Customer customer, String name) {
        for(Game game : games) {
           if(game.getName().equals(name)) {
               customer.getLibrary().add(game);
               return true;
           }
        }
        return false;
    }

    public void applie(Campain campain) {
        if (campain.isGeneral()) {
            All(campain);
        }else one(campain);
    }

    private void All(Campain campain) {
        for(Game game : games) {
            game.setPrice(game.getPrice() * campain.getAmount());
        }
    }

    private void one(IndivudalCanpain campain) {
        for(Game game : games) {
            if (game.getName().equals(campain.getGameName())) {
                game.setPrice(game.getPrice() * campain.getAmount());
            }
        }
    }

}
