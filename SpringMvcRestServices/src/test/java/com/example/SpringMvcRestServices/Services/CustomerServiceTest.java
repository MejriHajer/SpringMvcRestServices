package com.example.SpringMvcRestServices.Services;

import com.example.SpringMvcRestServices.Web.Model.BeerDto;
import com.example.SpringMvcRestServices.Web.Model.CustomerDto;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class CustomerServiceTest implements  CustomerService{

    @Override
    public CustomerDto getCustomerById(UUID ID) {
        return CustomerDto.builder().id(UUID.randomUUID()).name("Hajer Mejri").build();
    }
}