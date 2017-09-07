package com.example.demo.Rest;

import com.example.demo.Customers;

import java.util.ArrayList;
import java.util.List;


public class CustomerStorageService {

    private List<Customers> customers = new ArrayList<>();



    public Customers getCustomer(String id) {
        for (Customers customer : customers) {
            if (id.equals(customer.getId())) {
                return customer;
            }
        }
        return null;
    }

    public void addCustomer(Customers customers){
        if(customers.getId()!=null){
            Customers resultCustomer = getCustomer(customers.getId());
            if(resultCustomer==null){
                customers.add(customers);
            }

        }

    }

    public int getSize() {
        return customers.size();
    }

}