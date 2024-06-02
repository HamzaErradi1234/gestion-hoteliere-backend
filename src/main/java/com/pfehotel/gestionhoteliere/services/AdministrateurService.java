package com.pfehotel.gestionhoteliere.services;

import com.pfehotel.gestionhoteliere.entities.Administrateur;
import com.pfehotel.gestionhoteliere.entities.Chambre;
import com.pfehotel.gestionhoteliere.entities.Client;
import com.pfehotel.gestionhoteliere.repositories.AdministrateurRepository;
import com.pfehotel.gestionhoteliere.repositories.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface AdministrateurService {
    boolean authenticate(String username, String email, String password);
    void addAdministrateur(Administrateur administrateur);

    List<Administrateur> getAdministrateurs();

    Administrateur getAdministrateur(Long id);

    void UpdateAdministrateur(Long id, Administrateur administrateur);

    void DeleteAdministrateur(Long id);


    public default boolean register(String username, String email, String password) {
        // Logique d'inscription à implémenter ici
        // Par exemple, vous pouvez ajouter l'administrateur à la base de données
        return true; // Retournez true si l'inscription réussit, sinon false
    }
}
