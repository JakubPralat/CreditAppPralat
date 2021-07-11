package pralat.inteca.customerservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pralat.inteca.customerservice.models.CreditCustomer;
import pralat.inteca.customerservice.models.Customer;

import java.util.Arrays;

@RestController
@RequestMapping(path = "/customer")
public class CustomerController {

    @GetMapping
    public CreditCustomer getCustomer(){
        CreditCustomer creditCustomer = new CreditCustomer();
        creditCustomer.setCreditCustomer(Arrays.asList(
                new Customer(1,1,"Jakub", "Pralat", "96020602153"),
                new Customer(2,2,"Michal", "Pralat", "99999912345")
        ));
        return creditCustomer;
    }
}
