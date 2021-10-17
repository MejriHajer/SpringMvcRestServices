package com.example.SpringMvcRestServices.Services;

import com.example.SpringMvcRestServices.Web.Model.BeerDto;
import com.example.SpringMvcRestServices.Web.Model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID ID) {
        return CustomerDto.builder().id(UUID.randomUUID()).name("Hajer").build();
    }
}
