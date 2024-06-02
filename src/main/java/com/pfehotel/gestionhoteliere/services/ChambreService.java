package com.pfehotel.gestionhoteliere.services;

import com.pfehotel.gestionhoteliere.entities.Chambre;
import com.pfehotel.gestionhoteliere.entities.Client;

import java.util.List;

public interface ChambreService {
    void addChambre(Chambre chambre);

    List<Chambre> getChambres();

    Chambre getChambre(Long id);

    void UpdateChambre(Long id, Chambre chambre);

    void DeleteChambre(Long id);
}
