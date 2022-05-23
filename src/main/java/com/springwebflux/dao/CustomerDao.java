package com.springwebflux.dao;

import com.springwebflux.dto.Customer;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Component
public class CustomerDao {
    public static void sleepExecut(int i)  {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public List<Customer> getCutomers()  {
       return IntStream.range(1,50)
               .peek(CustomerDao::sleepExecut)
               .peek(o-> System.out.println("processing count"+o))
        .mapToObj(i-> new Customer(i, "customer "+i)).collect(Collectors.toList());
    }
}
