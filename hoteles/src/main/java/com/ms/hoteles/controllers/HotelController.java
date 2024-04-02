package com.ms.hoteles.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.ms.hoteles.models.Hotel;
import com.ms.hoteles.services.HotelService;
import org.springframework.web.bind.annotation.GetMapping;

//@CrossOrigin(origins = "*")
@RestController
public class HotelController {

    @Autowired
    HotelService hotelService;

    @GetMapping(value = "hotels", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Hotel> devolverHoteles() {
        return hotelService.getListOfHotels();
    }

}
