package concrete;

import abstracts.ICampaignService;
import entities.Game;

public abstract class CampaignManager implements ICampaignService {

    @Override
    public double discount(Game game) {
        return game.getPrice();


    }
}
