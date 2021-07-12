package pralat.inteca.productservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pralat.inteca.productservice.dao.ProductDAO;
import pralat.inteca.productservice.models.CreditProduct;
import pralat.inteca.productservice.models.Product;
import pralat.inteca.productservice.services.ProductService;

import java.util.Arrays;

@RestController
@RequestMapping(path = "/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public CreditProduct getProduct(){
        CreditProduct creditProduct = new CreditProduct();
        creditProduct.setCreditProduct(productService.getAllProducts());
        return creditProduct;
    }
}
