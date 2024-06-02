package com.pfehotel.gestionhoteliere.services;

import com.pfehotel.gestionhoteliere.entities.Reservation;
import com.pfehotel.gestionhoteliere.repositories.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
@Service
public class ReservationSerivceImpl implements ReservationSerivce {
    @Autowired
    private ReservationRepository reservationRepository;
    @Override
    public void addReservation(Reservation reservation) {
        reservationRepository.save(reservation);
    }

    @Override
    public List<Reservation> getReservations() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation getReservation(Long id) {
      Reservation reservation =  reservationRepository
              .findById(id)
              .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND,"Invalid reservation id "+id));
        return reservation;    }

    @Override
    public void UpdateReservation(Long id, Reservation reservation) {
       Reservation reservtion = reservationRepository
                .findById(id)
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND,"Invalid client id "+id));

        reservation.setId(id);
        reservationRepository.save(reservation);

    }

    @Override
    public void DeleteReservation(Long id) {
        Reservation reservation = reservationRepository
                .findById(id)
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND,"Invalid reservation id "+id));

        reservation.setId(id);
        reservationRepository.delete(reservation);
    }
}
