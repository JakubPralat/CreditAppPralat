package pralat.inteca.creditservice.models;

import java.util.List;

public class CreditProduct {

    private List<Product> creditProduct;

    public List<Product> getCreditProduct() {
        return creditProduct;
    }

    public void setCreditProduct(List<Product> creditProduct) {
        this.creditProduct = creditProduct;
    }
}
