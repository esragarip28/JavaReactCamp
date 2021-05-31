package gamerSimulation.Adapters;

import gamerSimulation.abstracts.GamerCheckService;
import gamerSimulation.entities.Gamer;
import gamerSimulation.mernisReference.AESKPSPublicSoap;

public class MernisServiceAdapter implements GamerCheckService {


    @Override
    public boolean checkIfRealGamer(Gamer gamer) {
       AESKPSPublicSoap client=new AESKPSPublicSoap();
        try{
            return client.TCKimlikNoDogrula(Long.valueOf(gamer.getNationalityId()),gamer.getName(),gamer.getSurname(),gamer.getBirthYear());

        }catch (Exception ex){
            System.out.println("error occurred");
        }
        return false;
    }
}
