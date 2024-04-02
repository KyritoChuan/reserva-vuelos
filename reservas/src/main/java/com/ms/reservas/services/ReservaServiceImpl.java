package com.ms.reservas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import com.ms.reservas.dao.ReservaDao;
import com.ms.reservas.models.Reserva;

public class ReservaServiceImpl implements ReservaService {
    @Autowired
    ReservaDao reservaDao;

    @Autowired
    RestTemplate template;

    String url = "http://servicio-vuelos";

    @Override
    public void createReserva(Reserva reserva, int totalPersonas) {
        reservaDao.createReserva(reserva);
        template.put(url + "/vuelos/{p1}/{p2}", null, reserva.getIdVuelo(), totalPersonas);
    }

    @Override
    public List<Reserva> getReservas() {
        return reservaDao.getReservas();
    }

}
