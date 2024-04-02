package com.ms.hoteles.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.hoteles.dao.HotelDao;
import com.ms.hoteles.models.Hotel;

@Service
public class HotelServiceImpl implements HotelService {
    @Autowired
    HotelDao hotelDAO;

    @Override
    public List<Hotel> getListOfHotels() {
        List<Hotel> hotels = hotelDAO.getAllHotels();
        return hotels.stream().filter(hotel -> hotel.isDisponible() == true).collect(Collectors.toList());
    }

}
