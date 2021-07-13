package pralat.inteca.productservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pralat.inteca.productservice.dao.ProductDAO;
import pralat.inteca.productservice.models.Product;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductDAO productDAO;

    public List<Product> getAllProducts(){
        return productDAO.list();
    }

    public void createProduct(Product product){
        productDAO.createProduct(product);
    }
}
