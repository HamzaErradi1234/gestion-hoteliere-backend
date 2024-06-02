package com.pfehotel.gestionhoteliere.entities;

import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
    @Entity @AllArgsConstructor @NoArgsConstructor @Data
    public class Client {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
       @Column(name="nom",nullable = false,unique=true,length=40)
        private String nom;
        @Column(name="prenom",nullable = false,unique=true,length=40)
        private String prenom;
        @Column(name="email",nullable = false,unique=true,length=40)
        private String email;
        @Column(name="passeword",nullable = false,unique=true,length=40)
        private String password;
//
//        @OneToMany(mappedBy="client",fetch=FetchType.EAGER)
//        private List<Reservation> reservations=new ArrayList<>();
//        public void addReservation(Reservation reservation){
//            reservations.add(reservation );
//        }
//        public void annulerReservation(Reservation reservation){
//            reservations.remove(reservation);
//        }




}
