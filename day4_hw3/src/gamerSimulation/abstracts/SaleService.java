package gamerSimulation.abstracts;

import gamerSimulation.entities.Campaign;
import gamerSimulation.entities.Game;
import gamerSimulation.entities.Gamer;

public interface SaleService {

    void buy(Game game, Gamer gamer);
    void campaignSale(Game game, Campaign campaign,Gamer gamer);


}
