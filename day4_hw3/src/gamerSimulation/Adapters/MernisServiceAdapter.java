package gamerSimulation.Adapters;

import gamerSimulation.abstracts.GamerCheckService;
import gamerSimulation.entities.Gamer;
import gamerSimulation.mernisReference.WPBKPSPublicSoap;

public class MernisServiceAdapter implements GamerCheckService {


    @Override
    public boolean checkIfRealGamer(Gamer gamer) {
       WPBKPSPublicSoap client=new WPBKPSPublicSoap();
        try{
            return client.TCKimlikNoDogrula(Long.valueOf(gamer.getNationalityId()),gamer.getName(),gamer.getSurname(),gamer.getBirthYear());

        }catch (Exception ex){
            System.out.println("error occurred");
        }
        return false;
    }
}
