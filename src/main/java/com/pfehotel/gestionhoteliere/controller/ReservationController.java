package com.pfehotel.gestionhoteliere.controller;


import com.pfehotel.gestionhoteliere.entities.Client;
import com.pfehotel.gestionhoteliere.entities.Reservation;
import com.pfehotel.gestionhoteliere.repositories.ClientRepository;
import com.pfehotel.gestionhoteliere.repositories.ReservationRepository;
import com.pfehotel.gestionhoteliere.services.ClientService;
import com.pfehotel.gestionhoteliere.services.ReservationSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
@RestController
@RequestMapping("/reservations")
@CrossOrigin("http://localhost:3000")
public class ReservationController {

    @Autowired
    private ReservationSerivce reservationSerivce;
    @PostMapping("/add")
    public String add(@RequestBody Reservation reservation){
        reservationSerivce.addReservation(reservation);
        return "La reservation est ajoute avec succes";
    }
    @GetMapping
    public List<Reservation> getReservations(){
        return reservationSerivce.getReservations();
    }
    @GetMapping("/get")
    public Reservation getReservation(@RequestParam Long id){
        return reservationSerivce.getReservation(id);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<Void> UpdateReservation(@PathVariable Long id, @RequestBody Reservation reservation){
        reservationSerivce.UpdateReservation(id,reservation);
        return ResponseEntity.noContent().build();
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void>DeleteReservation(@PathVariable Long id){
        reservationSerivce.DeleteReservation(id);
        return ResponseEntity.noContent().build() ;
    }





}
