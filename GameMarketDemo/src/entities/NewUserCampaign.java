package entities;

import concrete.CampaignManager;

public class NewUserCampaign extends CampaignManager {



    @Override
    public double discount(Game game) {
        return game.getPrice()*(0.5);
    }
}
