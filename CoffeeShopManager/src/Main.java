import abstracts.BaseCustomerManager;
import adapters.MernisServiceAdapter;
import concrete.NeroCustomerManager;
import concrete.StarbucksCustomerManager;
import entities.Customer;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.setId(1);
        customer1.setFirstName("Emir Bekir");
        customer1.setLastName("YAŞAR");
        customer1.setNationalityID("55555555555");
        customer1.setDateOfBirth(LocalDate.of(1997,2,16));

        BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
        customerManager.save(customer1);
    }
}
