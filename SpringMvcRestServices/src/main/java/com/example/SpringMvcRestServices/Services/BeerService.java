package com.example.SpringMvcRestServices.Services;

import com.example.SpringMvcRestServices.Web.Model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;
public interface BeerService     {
    BeerDto getBeerById(UUID beerId);

}
