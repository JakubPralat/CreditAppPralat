package pralat.inteca.productservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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
    public CreditProduct getAllProducts(){
        CreditProduct creditProduct = new CreditProduct();
        creditProduct.setCreditProduct(productService.getAllProducts());
        return creditProduct;
    }

    @PostMapping
    @RequestMapping(path = "/create")
    public void createProduct(@RequestBody Product product){
        productService.createProduct(product);
    }
}
