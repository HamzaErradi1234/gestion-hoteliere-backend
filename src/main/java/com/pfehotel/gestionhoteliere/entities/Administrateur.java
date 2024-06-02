package com.pfehotel.gestionhoteliere.entities;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ListIndexBase;
import org.hibernate.annotations.ListIndexJavaType;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="admin")
public class Administrateur  {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id_admin;
    private String username;
    private String email;
    private String password;


}
