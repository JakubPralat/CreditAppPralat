package pralat.inteca.productservice.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import pralat.inteca.productservice.models.Product;

import java.util.List;

@Component
public class ProductDAO {

    private static final Logger log = LoggerFactory.getLogger(Product.class);
    private JdbcTemplate jdbcTemplate;

    RowMapper<Product> rowMapper = ((resultSet, i) -> {
        Product product = new Product();
        product.setId(resultSet.getInt("id"));
        product.setCreditId(resultSet.getInt("creditId"));
        product.setName(resultSet.getString("name"));
        product.setValue(resultSet.getInt("value"));
        return product;
    });

    public ProductDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Product> list(){
        String sql = "SELECT id, creditId, name, value from product";
        return jdbcTemplate.query(sql, rowMapper);
    }

    public void createProduct(Product product){
        String sql = "insert into product(creditId, name, value) values(?,?,?)";
        Integer insert = jdbcTemplate.update(sql, product.getCreditId(), product.getName(), product.getValue());
    }
}
