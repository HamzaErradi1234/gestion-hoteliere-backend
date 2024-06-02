package com.pfehotel.gestionhoteliere.services;

import com.pfehotel.gestionhoteliere.entities.Chambre;
import com.pfehotel.gestionhoteliere.entities.Client;
import com.pfehotel.gestionhoteliere.repositories.ChambreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
@Service
public class ChambreServiceImpl implements ChambreService {
    @Autowired
    private ChambreRepository chambreRepository;
    @Override
    public void addChambre(Chambre chambre) {
    chambreRepository.save(chambre);
    }

    @Override
    public List<Chambre> getChambres() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre getChambre(Long id) {
        Chambre chambre = chambreRepository
                .findById(id)
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND,"Invalid chambre id "+id));

        return chambre;
    }

    @Override
    public void UpdateChambre(Long id, Chambre chambre) {
        chambreRepository
                .findById(id)
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND,"Invalid chambre id "+id));

        chambre.setId(id);
        chambreRepository.save(chambre);
    }


    @Override
    public void DeleteChambre(Long id) {
        Chambre chambre = chambreRepository
                .findById(id)
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND,"Invalid chambre id "+id));

        chambreRepository.delete(chambre);
    }
}
