package com.ms.vuelos.services;

import java.util.List;

import com.ms.vuelos.models.Vuelo;

public interface VueloService {
    List<Vuelo> getAvailableFlights(int plazas);

    void updateFlightPlazas(int idVuelo, int plazas);
}
