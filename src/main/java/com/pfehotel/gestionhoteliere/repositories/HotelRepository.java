package com.pfehotel.gestionhoteliere.repositories;

import com.pfehotel.gestionhoteliere.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends JpaRepository<Hotel,Long> {
}