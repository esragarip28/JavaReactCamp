package gamerSimulation.concretes;

import gamerSimulation.abstracts.GameService;
import gamerSimulation.abstracts.GamerCheckService;
import gamerSimulation.entities.Game;

public class GameManager implements GameService {


    @Override
    public void add(Game game) {
        System.out.println(game.getName()+ " has been added");

    }

    @Override
    public void delete(Game game) {
        System.out.println(game.getName()+ " has been deleted");

    }

    @Override
    public void update(Game game) {

        System.out.println(game.getName()+" has been updated");
    }
}
