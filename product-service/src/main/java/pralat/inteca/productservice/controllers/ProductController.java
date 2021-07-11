package pralat.inteca.productservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pralat.inteca.productservice.models.CreditProduct;
import pralat.inteca.productservice.models.Product;

import java.util.Arrays;

@RestController
@RequestMapping(path = "/product")
public class ProductController {

    @GetMapping
    public CreditProduct getProduct(){
        CreditProduct creditProduct = new CreditProduct();
        creditProduct.setCreditProduct(Arrays.asList(
                new Product(1,1,"car",1000),
                new Product(2,2,"bike",500)
        ));
        return creditProduct;
    }
}
