package com.ms.hoteles.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ms.hoteles.models.Hotel;
import com.ms.hoteles.repositories.HotelRepository;

@Repository
public class HotelDaoImpl implements HotelDao {

    @Autowired
    HotelRepository hotelRepository;

    @Override
    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }

}
