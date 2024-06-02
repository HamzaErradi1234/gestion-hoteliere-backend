package com.pfehotel.gestionhoteliere.controller;

import com.pfehotel.gestionhoteliere.entities.Chambre;
import com.pfehotel.gestionhoteliere.entities.Client;
import com.pfehotel.gestionhoteliere.services.ChambreService;
import com.pfehotel.gestionhoteliere.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@Service
@RequestMapping("/chambres")
public class ChambreController {

    @Autowired
    private ChambreService chambreService;
    @PostMapping("/add")
    public String add(@RequestBody Chambre chambre){
        chambreService.addChambre(chambre);
        return "Le chambre ajoute avec succes";
    }
    @GetMapping
    public List<Chambre> getChambres(){
        return chambreService.getChambres();
    }
    @GetMapping("/getChambre")
    public Chambre getChambre(@RequestParam Long id){
        return chambreService.getChambre(id);
    }
    @PutMapping("/updateChambre/{id}")
    public ResponseEntity<Void> UpdateChambre(@PathVariable Long id, @RequestBody Chambre chambre){
        chambreService.UpdateChambre(id,chambre);
        return ResponseEntity.noContent().build() ;
    }

    @DeleteMapping("/deleteChambre/{id}")
    public ResponseEntity<Void>DeleteChambre(@PathVariable Long id){
        chambreService.DeleteChambre(id);
        return ResponseEntity.noContent().build() ;
    }


}
