package com.ms.reservas.dao;

import java.util.List;

import com.ms.reservas.models.Reserva;

public interface ReservaDao {
    public void createReserva(Reserva reserva);

    List<Reserva> getReservas();
}
