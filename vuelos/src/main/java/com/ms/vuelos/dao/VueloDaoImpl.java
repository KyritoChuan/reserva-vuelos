package com.ms.vuelos.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ms.vuelos.models.Vuelo;
import com.ms.vuelos.repositories.VueloRepository;

@Repository
public class VueloDaoImpl implements VueloDao {
    @Autowired
    VueloRepository vueloRepository;

    @Override
    public List<Vuelo> getListOfFlights() {
        var vuelos = vueloRepository.findAll();
        return vuelos;
    }

    @Override
    public Vuelo getFlight(int idVuelo) {
        var vuelo = vueloRepository.findById(idVuelo).orElse(null);
        return vuelo;
    }

    @Transactional
    @Override
    public void updateFlight(Vuelo vuelo) {
        vueloRepository.save(vuelo);

    }

}
