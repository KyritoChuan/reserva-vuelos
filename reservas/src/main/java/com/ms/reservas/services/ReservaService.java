package com.ms.reservas.services;

import java.util.List;

import com.ms.reservas.models.Reserva;

public interface ReservaService {
    void createReserva(Reserva reserva, int totalPersonas);

    List<Reserva> getReservas();
}
