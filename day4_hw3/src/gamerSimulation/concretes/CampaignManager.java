package gamerSimulation.concretes;

import gamerSimulation.abstracts.CampaignService;
import gamerSimulation.entities.Campaign;

public class CampaignManager implements CampaignService {
    @Override
    public void add(Campaign campaign) {
        System.out.println( campaign.getName()+ " has been added");

    }

    @Override
    public void update(Campaign campaign) {
        System.out.println(campaign.getName()+" has been updated");

    }

    @Override
    public void delete(Campaign campaign) {
        System.out.println(campaign.getName()+" has been deleted");
    }
}
