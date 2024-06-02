package com.pfehotel.gestionhoteliere.controller;

import com.pfehotel.gestionhoteliere.entities.Client;
import com.pfehotel.gestionhoteliere.entities.Hotel;
import com.pfehotel.gestionhoteliere.services.ClientService;
import com.pfehotel.gestionhoteliere.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
@RestController
@RequestMapping("/hotel")
public class HotelController {
@Autowired
private HotelService hotelService;
    @PostMapping("/add")
    public String add(@RequestBody Hotel hotel){
        hotelService.addHotel(hotel);
        return "Hotel ajoute succes";
    }
    @GetMapping
    public List<Hotel> getHotels(){
        return hotelService.getHotels();
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Void> UpdateHotel(@PathVariable Long id, @RequestBody Hotel hotel){
       hotelService.UpdateHotel(id,hotel);
        return ResponseEntity.noContent().build() ;
    }

}
