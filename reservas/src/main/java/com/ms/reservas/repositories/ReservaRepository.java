package com.ms.reservas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.reservas.models.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva, Integer> {

}
