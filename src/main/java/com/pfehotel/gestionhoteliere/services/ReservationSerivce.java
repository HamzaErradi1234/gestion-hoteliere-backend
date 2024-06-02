package com.pfehotel.gestionhoteliere.services;

import com.pfehotel.gestionhoteliere.entities.Client;
import com.pfehotel.gestionhoteliere.entities.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReservationSerivce {

    void addReservation(Reservation reservation);

    List<Reservation> getReservations();

    Reservation getReservation(Long id);

    void UpdateReservation(Long id, Reservation reservation);

    void DeleteReservation(Long id);
}
