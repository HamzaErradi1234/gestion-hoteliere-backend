package com.pfehotel.gestionhoteliere.controller;
import com.pfehotel.gestionhoteliere.entities.Client;
import com.pfehotel.gestionhoteliere.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
@RestController
@RequestMapping("/client")
@CrossOrigin("http://localhost:3000")
public class ClientController{
    @Autowired
    private ClientService clientService;
    @PostMapping("/add")
    public String add(@RequestBody Client client){
        clientService.addClient(client);
        return "successful add";
    }
    @GetMapping
    public List<Client> getClients(){
        return clientService.getClients();
    }
    @GetMapping("/get")
    public Client getClient(@RequestParam Long id){
        return clientService.getClient(id);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<Void> UpdateClient(@PathVariable Long id, @RequestBody Client client){
        clientService.UpdateClient(id,client);
        return ResponseEntity.noContent().build() ;
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void>DeleteClient(@PathVariable Long id){
        clientService.DeleteClient(id);
        return ResponseEntity.noContent().build() ;
    }
}

