package gamerSimulation.concretes;

import gamerSimulation.abstracts.SaleService;
import gamerSimulation.entities.Campaign;
import gamerSimulation.entities.Game;
import gamerSimulation.entities.Gamer;

public class SaleManager implements SaleService {
    @Override
    public void buy(Game game, Gamer gamer) {
        System.out.println(game.getName()+" has been bought by "+gamer.getName());

    }

    @Override
    public void campaignSale(Game game, Campaign campaign, Gamer gamer) {
    double unitsPrice=game.getUnitsPrice()-(game.getUnitsPrice()*campaign.getDiscount()/100);
        System.out.println("discounted price :"+ unitsPrice+" has been paid by "+gamer.getName()+" "+gamer.getSurname());
    }
}
