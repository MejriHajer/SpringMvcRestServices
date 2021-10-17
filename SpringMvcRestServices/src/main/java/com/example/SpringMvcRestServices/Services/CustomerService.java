package com.example.SpringMvcRestServices.Services;

import com.example.SpringMvcRestServices.Web.Model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID ID);
}
