package pralat.inteca.customerservice.models;

import java.util.List;

public class CreditCustomer {

    private List<Customer> creditCustomer;

    public List<Customer> getCreditCustomer() {
        return creditCustomer;
    }

    public void setCreditCustomer(List<Customer> creditCustomer) {
        this.creditCustomer = creditCustomer;
    }
}
