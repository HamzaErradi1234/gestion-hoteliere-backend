package com.pfehotel.gestionhoteliere.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Date;

@Entity @Data @AllArgsConstructor @NoArgsConstructor
@Builder
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="email",nullable = false,unique=true,length=40)
    private String email;
    @Column(name="passeword",nullable = false,unique=true,length=40)
    private String password;
    @Column(name="date_Debut")
    private Date dateDebut;
    @Column(name="date_Fin")
    private Date dateFin;
    private double payment;


}
