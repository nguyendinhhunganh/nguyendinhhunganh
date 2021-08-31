package case_study.services;

import case_study.models.Customer;

public interface CustomerService extends Service {
    public Customer isCustomer(int customerCode);
}
