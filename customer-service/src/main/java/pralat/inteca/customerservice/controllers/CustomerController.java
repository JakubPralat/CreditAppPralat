package pralat.inteca.customerservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pralat.inteca.customerservice.dao.CustomerDAO;
import pralat.inteca.customerservice.models.CreditCustomer;
import pralat.inteca.customerservice.models.Customer;
import pralat.inteca.customerservice.services.CustomerService;

import java.util.Arrays;

@RestController
@RequestMapping(path = "/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    public CreditCustomer getCustomer(){
        CreditCustomer creditCustomer = new CreditCustomer();
        creditCustomer.setCreditCustomer(customerService.getAllCustomers());
        return creditCustomer;
    }
}
