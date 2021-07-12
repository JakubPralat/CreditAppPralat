package pralat.inteca.creditservice.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import pralat.inteca.creditservice.models.Credit;

import java.util.List;

@Component
public class CreditDAO {

    private static final Logger log = LoggerFactory.getLogger(Credit.class);
    private JdbcTemplate jdbcTemplate;

    RowMapper<Credit> rowMapper = ((resultSet, i) -> {
        Credit credit = new Credit();
        credit.setId(resultSet.getInt("id"));
        credit.setCreditName(resultSet.getString("creditName"));
        return credit;
    });

    public CreditDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Credit> list() {
        String sql = "SELECT id, creditName from credit";
        return jdbcTemplate.query(sql, rowMapper);
    }
}
