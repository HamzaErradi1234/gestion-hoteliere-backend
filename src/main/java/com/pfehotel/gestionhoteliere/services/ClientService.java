package com.pfehotel.gestionhoteliere.services;

import com.pfehotel.gestionhoteliere.entities.Client;
import com.pfehotel.gestionhoteliere.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClientService {
    void addClient(Client client);

    List<Client> getClients();

    Client getClient(Long id);

    void UpdateClient(Long id, Client client);

    void DeleteClient(Long id);


}
