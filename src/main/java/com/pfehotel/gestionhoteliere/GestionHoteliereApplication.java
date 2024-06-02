package com.pfehotel.gestionhoteliere;

import com.pfehotel.gestionhoteliere.entities.Client;
import com.pfehotel.gestionhoteliere.entities.Reservation;
import com.pfehotel.gestionhoteliere.repositories.ClientRepository;
import com.pfehotel.gestionhoteliere.repositories.ReservationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@SpringBootApplication
public class GestionHoteliereApplication {
  @RequestMapping("/")
     String home(){
    return "hello world";
}

    public static void main(String[] args) {
        SpringApplication.run(GestionHoteliereApplication.class, args);

    }


}
