package gamerSimulation.concretes;

import gamerSimulation.abstracts.GamerCheckService;
import gamerSimulation.abstracts.GamerService;
import gamerSimulation.entities.Gamer;

public class GamerManager implements GamerService {
    private GamerCheckService gamerCheckService;

    public GamerManager(GamerCheckService gamerCheckService) {
        this.gamerCheckService = gamerCheckService;
    }

    @Override
    public void update(Gamer gamer) {
        System.out.println(gamer.getName()+" "+gamer.getSurname()+ " has been updated");
    }

    @Override
    public void delete(Gamer gamer) {
        System.out.println(gamer.getName()+" "+gamer.getSurname()+ " has been deleted");

    }
    @Override
    public void save(Gamer gamer) {
        if (gamerCheckService.checkIfRealGamer(gamer)){
            System.out.println("gamer has been saved successfully");
        }
        else{
            System.out.println("gamer is not valid!!!");
        }


    }
}
