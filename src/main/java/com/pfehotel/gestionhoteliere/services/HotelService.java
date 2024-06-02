package com.pfehotel.gestionhoteliere.services;
import com.pfehotel.gestionhoteliere.entities.Client;
import com.pfehotel.gestionhoteliere.entities.Hotel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HotelService {

    void addHotel(Hotel hotel);

    List<Hotel> getHotels();

    void UpdateHotel(Long id, Hotel hotel);





//
//    private Hotel hotel; // Unique instance d'hôtel
//
//    public HotelService() {
//        // Initialisation de l'hôtel
//        this.hotel = new Hotel();
//        this.hotel.setIdHo(1L); // ID de l'hôtel unique
//        this.hotel.setNom("Château de Luxe");
//        this.hotel.setAdresse("123 Casablanca Maroc");
//        this.hotel.setNuméroEtoile(4);
//        this.hotel.setNombreChambre(12); // Nombre de chambres de l'hôtel
//    }
//
//    // Service pour obtenir l'hôtel unique
//    public Hotel getHotel() {
//        return hotel;
//    }
//
//    // Service pour mettre à jour les détails de l'hôtel
//    public Hotel updateHotelDetails(Hotel updatedHotelDetails) {
//        // Implémentation pour mettre à jour les détails de l'hôtel dans la base de données
//        // Pour un hôtel unique, vous pouvez mettre à jour directement l'instance d'hôtel actuelle
//        this.hotel.setNom(updatedHotelDetails.getNom());
//        this.hotel.setAdresse(updatedHotelDetails.getAdresse());
//        this.hotel.setNombreChambre(updatedHotelDetails.getNombreChambre());
//        return this.hotel;
//    }
//
//    // Autres méthodes de service pour gérer les opérations liées à l'hôtel unique
}

