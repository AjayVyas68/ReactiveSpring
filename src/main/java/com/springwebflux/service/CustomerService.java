package com.springwebflux.service;

import com.springwebflux.dao.CustomerDao;
import com.springwebflux.dto.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerDao customerDao;

    public CustomerService(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }
    public List<Customer> getAllCustoer()
    {
         long start=System.currentTimeMillis();
        List<Customer> data= customerDao.getCutomers();
        long end=System.currentTimeMillis();
        System.out.println("executaion time ="+(start -end));
        return data;
    }
}
