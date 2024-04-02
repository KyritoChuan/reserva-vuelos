package com.ms.reservas.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ms.reservas.models.Reserva;
import com.ms.reservas.repositories.ReservaRepository;

public class ReservaDaoImpl implements ReservaDao {
    @Autowired
    ReservaRepository reservaRepository;

    @Override
    public void createReserva(Reserva reserva) {
        reservaRepository.save(reserva);
    }

    @Override
    public List<Reserva> getReservas() {
        return reservaRepository.findAll();
    }

}
