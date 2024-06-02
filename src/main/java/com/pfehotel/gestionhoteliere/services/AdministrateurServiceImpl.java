package com.pfehotel.gestionhoteliere.services;

import com.pfehotel.gestionhoteliere.entities.Administrateur;
import com.pfehotel.gestionhoteliere.repositories.AdministrateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdministrateurServiceImpl implements AdministrateurService {
    @Autowired
    private AdministrateurRepository administrateurRepository;

    @Override
    public boolean authenticate(String username, String email, String password) {
        Optional<Administrateur> administrateurOptional = administrateurRepository.findByUsernameAndEmail(username, email);
        if (administrateurOptional.isPresent()) {
            Administrateur administrateur = administrateurOptional.get();
            return administrateur.getPassword().equals(password);
        }
        return false;
    }
    @Override
    public void addAdministrateur(Administrateur administrateur) {
        administrateurRepository.save(administrateur);
    }
    @Override
    public List<Administrateur> getAdministrateurs() {
        return List.of();
    }

    @Override
    public Administrateur getAdministrateur(Long id) {
        return null;
    }

    @Override
    public void UpdateAdministrateur(Long id, Administrateur administrateur) {

    }

    @Override
    public void DeleteAdministrateur(Long id) {

    }

}