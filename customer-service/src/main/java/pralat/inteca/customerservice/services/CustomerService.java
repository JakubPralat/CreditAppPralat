package pralat.inteca.customerservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pralat.inteca.customerservice.dao.CustomerDAO;
import pralat.inteca.customerservice.models.Customer;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerDAO customerDAO;

    public List<Customer> getAllCustomers(){
        return customerDAO.list();
    }

    public  void createCustomer(Customer customer){
        customerDAO.createCustomer(customer);
    }
}
