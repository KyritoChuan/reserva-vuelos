package com.ms.vuelos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.vuelos.models.Vuelo;

public interface VueloRepository extends JpaRepository<Vuelo, Integer> {

}
