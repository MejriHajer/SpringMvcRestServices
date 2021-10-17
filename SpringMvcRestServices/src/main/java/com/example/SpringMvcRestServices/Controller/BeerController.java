package com.example.SpringMvcRestServices.Controller;

import com.example.SpringMvcRestServices.Services.BeerService;
import com.example.SpringMvcRestServices.Web.Model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    private final BeerService BeerService;

    public BeerController(com.example.SpringMvcRestServices.Services.BeerService beerService) {
        BeerService = beerService;
    }

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getbeer(@PathVariable("beerId") UUID beerId){
        return new ResponseEntity<>(BeerService.getBeerById(beerId), HttpStatus.OK);


    }
}
