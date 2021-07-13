package pralat.inteca.customerservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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

    @PostMapping
    @RequestMapping(path = "/create")
    public void createCustomer(@RequestBody Customer customer){
        customerService.createCustomer(customer);
    }
}
