import concrete.CampaignManager;
import concrete.CustomerCheckManager;
import concrete.CustomerManager;
import concrete.TradeManager;
import entities.Customer;
import entities.Game;
import entities.NewUserCampaign;
import entities.StudentCampaign;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.setId(1);
        customer1.setfName("Emir Bekir");
        customer1.setlName("Yaşar");
        customer1.setDayOfBirth(LocalDate.of(1997,2,16));

        Game game1 = new Game();
        game1.setGameName("EBY");
        game1.setPrice(1000);

        CustomerManager customerManager = new CustomerManager(new CustomerCheckManager());
        customerManager.add(customer1);


        TradeManager tradeManager = new TradeManager(new StudentCampaign());
        tradeManager.buyAGame(game1);




    }



}
