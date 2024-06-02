package com.pfehotel.gestionhoteliere.services;
import com.pfehotel.gestionhoteliere.entities.Client;
import com.pfehotel.gestionhoteliere.repositories.ClientRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;
import java.util.Optional;
@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    private  ClientRepository clientRepository;
    @Override
    public void addClient(Client client) {
  clientRepository.save(client);
    }
    @Override
    public List<Client> getClients() {
        return clientRepository.findAll();
    }
    @Override
    public Client getClient(Long id) {
        Client client = clientRepository
                .findById(id)
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND,"Invalid client id "+id));
        return client;
    }
    @Override
    public void UpdateClient(Long id, Client updatedClient) {
        // Vérifiez d'abord si le client existe dans la base de données
        Optional<Client> optionalClient = clientRepository.findById(id);
        if (optionalClient.isPresent()) {
            // Mettez à jour les champs du client avec les nouvelles valeurs
            Client existingClient = optionalClient.get();
            existingClient.setNom(updatedClient.getNom());
            existingClient.setPrenom(updatedClient.getPrenom());
            existingClient.setEmail(updatedClient.getEmail());
            existingClient.setPassword(updatedClient.getPassword());
            // Enregistrez les modifications dans la base de données
            clientRepository.save(existingClient);
        } else {
            // Gérer le cas où le client n'est pas trouvé
            throw new EntityNotFoundException("Client not found with id: " + id);
        }
    }
    @Override
    public void DeleteClient(Long id) {
        Client client = clientRepository
                .findById(id)
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND,"Invalid client id "+id));

        clientRepository.delete(client);
    }
}
