package com.pfehotel.gestionhoteliere.repositories;

import com.pfehotel.gestionhoteliere.entities.Administrateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdministrateurRepository extends JpaRepository<Administrateur,Long> {
    Optional<Administrateur> findByUsernameAndEmail(String username, String email);

}
