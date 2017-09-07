package com.example.demo;

import java.util.function.BinaryOperator;

public class Customers {

    private String id;
    private String name;
    private String adress;
    private String countryCode;

    public Customers(){

        System.out.println(" first customer");

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        adress = adress;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        countryCode = countryCode;
    }



}
