package pralat.inteca.creditservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pralat.inteca.creditservice.dao.CreditDAO;
import pralat.inteca.creditservice.dto.CreditDTO;
import pralat.inteca.creditservice.models.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CreditService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private CreditDAO creditDAO;

    public List<CreditDTO> getAllCredits(){

        //get credits
        List<Credit> credits = creditDAO.list();

        //get customers
        CreditCustomer customers = restTemplate.getForObject("http://customer:8081/customer", CreditCustomer.class);

        //get products
        CreditProduct products = restTemplate.getForObject("http://product:8082/product", CreditProduct.class);

        //put everything together and return list
        return credits.stream().map(credit -> new CreditDTO(
                customers.getCreditCustomer().stream().filter(customer -> credit.getId().equals(customer.getCreditId())).findAny().get().getFirstName(),
                customers.getCreditCustomer().stream().filter(customer -> credit.getId().equals(customer.getCreditId())).findAny().get().getSurname(),
                customers.getCreditCustomer().stream().filter(customer -> credit.getId().equals(customer.getCreditId())).findAny().get().getPesel(),
                products.getCreditProduct().stream().filter(product -> credit.getId().equals(product.getCreditId())).findAny().get().getName(),
                products.getCreditProduct().stream().filter(product -> credit.getId().equals(product.getCreditId())).findAny().get().getValue(),
                credit.getCreditName())).collect(Collectors.toList());
    }

    public Integer createCredit(CreditDTO creditDTO){
        Integer creditNumber = creditDAO.createCredit(creditDTO);

        //post product
        ResponseEntity<String> result = restTemplate.postForEntity("http://product:8082/product/create", new Product(creditNumber, creditDTO.getProductName(), creditDTO.getValue()), String.class);

        //post customer
        result = restTemplate.postForEntity("http://customer:8081/customer/create", new Customer(creditNumber, creditDTO.getFirstName(), creditDTO.getSurname(), creditDTO.getPesel()), String.class);

        return creditNumber;
    }
}
