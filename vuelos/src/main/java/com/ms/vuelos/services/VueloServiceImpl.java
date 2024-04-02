package com.ms.vuelos.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.vuelos.dao.VueloDao;
import com.ms.vuelos.models.Vuelo;

@Service
public class VueloServiceImpl implements VueloService {
    @Autowired
    VueloDao vueloDAO;

    @Override
    public List<Vuelo> getAvailableFlights(int plazas) {
        var flights = vueloDAO.getListOfFlights().stream().filter(flight -> flight.getPlazas() >= plazas)
                .collect(Collectors.toList());
        return flights;
    }

    @Override
    public void updateFlightPlazas(int idVuelo, int plazas) {
        Vuelo vuelo = vueloDAO.getFlight(idVuelo);

        if (vuelo != null) {
            vuelo.setPlazas(vuelo.getPlazas() - plazas);
            vueloDAO.updateFlight(vuelo);
        }
    }

}
