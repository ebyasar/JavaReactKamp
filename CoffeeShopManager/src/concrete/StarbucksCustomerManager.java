package concrete;

import abstracts.BaseCustomerManager;
import abstracts.ICustomerCheckService;
import entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
    ICustomerCheckService customerCheckService;

    public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }



    @Override
    public void save(Customer customer) {

        if (customerCheckService.CheckIfRealPerson(customer)) {
            super.save(customer);
        } else {
            System.out.println("Not a valid person!");
        }

    }
}
