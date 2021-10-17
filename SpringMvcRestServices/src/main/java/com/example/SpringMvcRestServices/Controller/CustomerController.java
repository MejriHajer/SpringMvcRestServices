package com.example.SpringMvcRestServices.Controller;

import com.example.SpringMvcRestServices.Services.CustomerService;
import com.example.SpringMvcRestServices.Web.Model.CustomerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("/api/Customer")
@RestController
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(com.example.SpringMvcRestServices.Services.CustomerService CustomerService) {
        customerService = CustomerService;
    }


    @GetMapping("/{id}")
    public ResponseEntity<CustomerDto> GetCustomerByID(@PathVariable("id") UUID id) {
        return new ResponseEntity<>(customerService.getCustomerById(id), HttpStatus.OK);
    }
    }
