package pralat.inteca.creditservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pralat.inteca.creditservice.dto.CreditDTO;
import pralat.inteca.creditservice.models.*;
import pralat.inteca.creditservice.services.CreditService;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "/credit")
public class CreditController {

    @Autowired
    private CreditService creditService;

    @GetMapping
    public List<CreditDTO> getCredits(){
        return creditService.getAllCredits();
    }

    @PostMapping
    @RequestMapping(path = "/create")
    public Integer createCredit(@RequestBody CreditDTO creditDTO){
        return creditService.createCredit(creditDTO);
    }
}
