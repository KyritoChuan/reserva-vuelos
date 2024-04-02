package com.ms.vuelos.dao;

import java.util.List;

import com.ms.vuelos.models.Vuelo;

public interface VueloDao {
    public List<Vuelo> getListOfFlights();

    public Vuelo getFlight(int idVuelo);

    public void updateFlight(Vuelo vuelo);
}
