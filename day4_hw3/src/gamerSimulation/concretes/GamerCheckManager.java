package gamerSimulation.concretes;

import gamerSimulation.abstracts.GamerCheckService;
import gamerSimulation.entities.Gamer;

public class GamerCheckManager implements GamerCheckService {


    @Override
    public boolean checkIfRealGamer(Gamer gamer) {
        return true;
    }
}
