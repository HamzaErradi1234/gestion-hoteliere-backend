package com.pfehotel.gestionhoteliere.repositories;

import com.pfehotel.gestionhoteliere.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ClientRepository extends JpaRepository<Client,Long> {

     Client findByid(Long id);
}
