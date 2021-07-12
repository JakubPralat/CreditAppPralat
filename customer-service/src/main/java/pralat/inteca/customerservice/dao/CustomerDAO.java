package pralat.inteca.customerservice.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import pralat.inteca.customerservice.models.Customer;

import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

@Component
public class CustomerDAO {

    private static final Logger log = LoggerFactory.getLogger(Customer.class);
    private JdbcTemplate jdbcTemplate;

    RowMapper<Customer> rowMapper = ((resultSet, i) -> {
        Customer customer = new Customer();
        customer.setId(resultSet.getInt("id"));
        customer.setCreditId(resultSet.getInt("creditId"));
        customer.setFirstName(resultSet.getString("firstName"));
        customer.setSurname(resultSet.getString("surname"));
        customer.setPesel(resultSet.getString("pesel"));
        return customer;
    });

    public CustomerDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Customer> list() {
        String sql = "SELECT id, creditId, firstName, surname, pesel from customer";
        return jdbcTemplate.query(sql, rowMapper);
    }
}
