package com.belkarradi.Voiture.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.belkarradi.Voiture.Repositories.VoitureRepository;
import com.belkarradi.Voiture.entities.Voiture;

@Service
public class VoitureService {

    @Autowired
    private VoitureRepository voitureRepository;

    public Voiture enregistrerVoiture(Voiture voiture) {
        return voitureRepository.save(voiture);
    }

    public List<Voiture> getAllVoitures() {
        return voitureRepository.findAll();
    }

    public Voiture getVoitureById(Long id) {
        return voitureRepository.findById(id).orElse(null);
    }

    public List<Voiture> getVoituresByClientId(Long clientId) {
        return voitureRepository.findByClientId(clientId);
    }

}