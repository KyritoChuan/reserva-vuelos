package com.ms.reservas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ms.reservas.models.Reserva;
import com.ms.reservas.services.ReservaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

//@CrossOrigin(origins = "*")
@RestController
public class ReservaController {
    @Autowired
    ReservaService reservaService;

    @PostMapping(value = "reserva/{personas}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void generateReserva(@RequestBody Reserva reserva, @PathVariable("personas") int numeroPersonas) {
        this.reservaService.createReserva(reserva, numeroPersonas);
    }

    @GetMapping(value = "reservas", consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<Reserva> getReservas(@RequestParam String param) {
        return this.reservaService.getReservas();
    }
}
