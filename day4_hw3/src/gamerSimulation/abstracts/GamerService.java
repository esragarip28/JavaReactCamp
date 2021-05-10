package gamerSimulation.abstracts;

import gamerSimulation.entities.Gamer;

public interface GamerService {

    void update(Gamer gamer);
    void delete(Gamer gamer);
    void save(Gamer gamer);



}
