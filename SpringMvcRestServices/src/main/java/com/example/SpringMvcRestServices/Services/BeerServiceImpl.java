package com.example.SpringMvcRestServices.Services;

import com.example.SpringMvcRestServices.Web.Model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID()).beername("Galaxy Cat").beerStyle("Pale Ale").build();
    }
}
