package gamerSimulation;

import gamerSimulation.Adapters.MernisServiceAdapter;
import gamerSimulation.concretes.GameManager;
import gamerSimulation.concretes.GamerManager;
import gamerSimulation.concretes.SaleManager;
import gamerSimulation.entities.Campaign;
import gamerSimulation.entities.Game;
import gamerSimulation.entities.Gamer;
import gamerSimulation.entities.Sale;

public class Main {
    public static void main(String[] args) {
        Gamer gamer=new Gamer(1,"esra","garip","eragrp",1998,"24121848857");
        GamerManager gamerManager=new GamerManager(new MernisServiceAdapter());
        gamerManager.save(gamer);
        gamerManager.delete(gamer);
        gamerManager.update(gamer);
        gamerManager.save(gamer);

        Gamer gamer1=new Gamer(2,"esra","garip","era2",1998,"24781848623");
        gamerManager.save(gamer1);

        System.out.println("*************************");

        Game game=new Game(1,"X Game",50);
        GameManager gameManager=new GameManager();
        gameManager.add(game);
        gameManager.delete(game);
        gameManager.update(game);


        System.out.println("**************************");
        Campaign campaign=new Campaign(1,"Discount of Summer",20);

        System.out.println("******************************");
        Sale sale=new Sale(1);
        SaleManager saleManager=new SaleManager();
        saleManager.buy(game,gamer);
        saleManager.campaignSale(game,campaign,gamer);

        System.out.println("********************************");



    }


}
