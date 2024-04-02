package com.ms.hoteles.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.hoteles.models.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Integer> {

}
