package concrete;

import abstracts.ICustomerService;
import entities.Customer;

public class CustomerManager implements ICustomerService {
    CustomerCheckManager customerCheckManager;
    public CustomerManager(CustomerCheckManager customerCheckManager) {
        this.customerCheckManager = customerCheckManager;
    }




    @Override
    public void add(Customer customer) {
        if (customerCheckManager.ifRealPerson()) {
            System.out.println( customer.getfName() + "---->Müşteri doğrulaması yapıldı ve sisteme eklendi." );
        } else {
            System.out.println("kullanıcı bilgileri hatalı");

        }
    }

    @Override
    public void delete(Customer customer) {
        System.out.println("Sistemden silindi." + customer.getfName());

    }

    @Override
    public void uptate(Customer customer) {
        System.out.println("Bilgiler güncellendi." + customer.getfName());

    }
}
