package pralat.inteca.creditservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import pralat.inteca.creditservice.dao.CreditDAO;
import pralat.inteca.creditservice.models.*;
import pralat.inteca.creditservice.services.CreditService;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "/credit")
public class CreditController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private CreditService creditService;

    @GetMapping
    public List<String> getCredits(){

        //get credits
        List<Credit> credits = creditService.getAllCredits();
//        List<Credit> credits = Arrays.asList(new Credit(1,"xd"));

        //get customers
        CreditCustomer customers = restTemplate.getForObject("http://localhost:8081/customer", CreditCustomer.class);

        //get products
        CreditProduct products = restTemplate.getForObject("http://localhost:8082/product", CreditProduct.class);

        //put everything together and return list
        return credits.stream().map(credit -> credit.getCreditName() + customers.getCreditCustomer().get(0).getFirstName()
        + products.getCreditProduct().get(0).getName()).
                collect(Collectors.toList());
    }
}
