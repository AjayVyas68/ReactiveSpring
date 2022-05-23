package com.springwebflux.controller;

import com.springwebflux.dto.Customer;
import com.springwebflux.service.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controler {
    public Controler(CustomerService cus) {
        this.cus = cus;
    }

    private final CustomerService cus;
    @GetMapping
    public List<Customer> data()
    {
        return cus.getAllCustoer();
    }
}
