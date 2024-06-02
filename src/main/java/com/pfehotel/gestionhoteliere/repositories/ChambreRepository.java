package com.pfehotel.gestionhoteliere.repositories;

import com.pfehotel.gestionhoteliere.entities.Chambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ChambreRepository extends JpaRepository<Chambre,Long> {
    Chambre findChambreById(Long id);
    List<Chambre> findByType(String type);

}
