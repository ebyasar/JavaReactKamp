package adapters;

import MernisServiceReference.KPSPublic;
import abstracts.ICustomerCheckService;
import entities.Customer;

public class MernisServiceAdapter implements ICustomerCheckService {
    @Override
    public boolean CheckIfRealPerson(Customer customer) {
        KPSPublic kpsPublic = new KPSPublic();
        return kpsPublic.getKPSPublicSoap().tcKimlikNoDogrula(
                Long.parseLong(customer.getNationalityID()),
                customer.getFirstName().toUpperCase(),
                customer.getLastName().toUpperCase(),
                customer.getDateOfBirth().getYear());


    }
}
