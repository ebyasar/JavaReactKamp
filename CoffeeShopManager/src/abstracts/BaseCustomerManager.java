package abstracts;

import entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService{

    @Override
    public void save(Customer customer) {
        System.out.printf("saved to db   " + customer.getFirstName());

    }
}
