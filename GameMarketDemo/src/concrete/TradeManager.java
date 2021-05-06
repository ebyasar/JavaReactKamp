package concrete;

import entities.Game;

public class TradeManager {

    CampaignManager campaignManager;

    public TradeManager(CampaignManager campaignManager) {
        this.campaignManager = campaignManager;
    }

    public void buyAGame (Game game){
        System.out.println("oyun kampanya kullanılarak  " + campaignManager.discount(game) + "  tl'ye satıldı");

    }
}