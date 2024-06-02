package com.pfehotel.gestionhoteliere.services;

import com.pfehotel.gestionhoteliere.entities.Chambre;
import com.pfehotel.gestionhoteliere.entities.Client;
import com.pfehotel.gestionhoteliere.entities.Hotel;
import com.pfehotel.gestionhoteliere.repositories.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
@Service
public class HotelServiceImpl implements HotelService {
    @Autowired
    private HotelRepository hotelRepository;
    @Override
    public void addHotel(Hotel hotel) {
        hotelRepository.findAll();
    }

    @Override
    public List<Hotel> getHotels() {
        return hotelRepository.findAll();
    }
    @Override
    public void UpdateHotel(Long id, Hotel hotel) {
        hotelRepository
                .findById(id)
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND,"Invalid hotel id "+id));

        hotel.setId(id);
        hotelRepository.save(hotel);
    }

}
