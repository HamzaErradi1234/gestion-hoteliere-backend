package com.pfehotel.gestionhoteliere.controller;

import com.pfehotel.gestionhoteliere.entities.Administrateur;
import com.pfehotel.gestionhoteliere.services.AdministrateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/administrateurs")
@CrossOrigin("http://localhost:3000")
public class AdministrateurController {

    private static final String ADMIN_USERNAME = "admin";
    private static final String ADMIN_EMAIL = "admin@gmail.com";
    private static final String ADMIN_PASSWORD = "Admin##03";

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Administrateur administrateur) {
        if (administrateur.getUsername().equals(ADMIN_USERNAME) &&
                administrateur.getEmail().equals(ADMIN_EMAIL) &&
                administrateur.getPassword().equals(ADMIN_PASSWORD)) {
            return ResponseEntity.ok("Authentication successful");
        } else {
            return ResponseEntity.badRequest().body("Authentication failed");
        }
    }

    @PostMapping("/signup")
    public ResponseEntity<String> signup(@RequestBody Administrateur administrateur) {
        return ResponseEntity.badRequest().body("Signup not allowed");
    }
}
