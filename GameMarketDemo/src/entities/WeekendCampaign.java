package entities;

import concrete.CampaignManager;

public class WeekendCampaign extends CampaignManager {

    private final String campaignName = "Haftasonu KampanyasÄ±";

    public String getCampaignName() {
        return campaignName;
    }

    @Override
    public double discount(Game game) {
        return game.getPrice()*(0.9);
    }
}
