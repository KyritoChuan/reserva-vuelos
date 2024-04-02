package com.ms.vuelos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ms.vuelos.models.Vuelo;
import com.ms.vuelos.services.VueloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;

// @CrossOrigin(origins = "*")
@RestController
public class VueloController {
    @Autowired
    VueloService vueloService;

    @GetMapping(value = "vuelos/{plazas}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Vuelo> getFlights(@PathVariable("plazas") int plazas) {
        return vueloService.getAvailableFlights(plazas);
    }

    @PutMapping("vuelos/{idVuelo}/{plazas}")
    public void updateFlights(@PathVariable("idVuelo") int idVuelo, @PathVariable("plazas") int plazas) {
        vueloService.updateFlightPlazas(idVuelo, plazas);
    }
}
