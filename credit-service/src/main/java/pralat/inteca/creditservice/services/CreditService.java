package pralat.inteca.creditservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pralat.inteca.creditservice.dao.CreditDAO;
import pralat.inteca.creditservice.models.Credit;

import java.util.List;

@Service
public class CreditService {

    @Autowired
    private CreditDAO creditDAO;

    public List<Credit> getAllCredits(){
        return creditDAO.list();
    }
}
