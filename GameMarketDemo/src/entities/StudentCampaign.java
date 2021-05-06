package entities;

import concrete.CampaignManager;

public class StudentCampaign extends CampaignManager{


    @Override
    public double discount(Game game) {
        return game.getPrice()*(0.75);
    }

}
