package abstracts;

import entities.Customer;

public interface ICustomerService {
    void add(Customer customer);
    void delete(Customer customer);
    void uptate(Customer customer);
}
