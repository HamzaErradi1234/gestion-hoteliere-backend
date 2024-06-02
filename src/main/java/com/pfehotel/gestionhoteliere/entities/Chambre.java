package com.pfehotel.gestionhoteliere.entities;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;


import java.sql.Blob;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Entity @Data @AllArgsConstructor @NoArgsConstructor
public class Chambre  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int numero;
    private String type;
    @Column(name = "disponible")
    private boolean disponible=false;
    @Column(name = "Prix/Nuit(en DH)")
    private double prixNuit;

//    @OneToMany(mappedBy = "chambre", fetch = FetchType.LAZY, cascade=CascadeType.ALL)
//    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
//    private List<Reservation> reservations;
//    public Chambre(){
//        this.reservations=new ArrayList<>();
//    }
//    public void addReservation(Reservation reservation){
//        if(reservations==null){
//            reservations = new ArrayList<>();
//        }
//        reservations.add(reservation);
//        reservation.setChambre(this);
//       disponible=true;
////       String CodeRservation= RandomStringUtils.randomNumeric(10);
//    }

//
//    @Setter
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
//    @JoinColumn(name = "idHotel")
//    private Hotel hotel;


//
//    @ManyToOne
//
//    @JoinColumn(name = "administrateur_id")
//    private Administrateur administrateur;


}
