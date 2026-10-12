package tn.esprit.autoloccce17.Services;

import tn.esprit.autoloccce17.Entities.Agence;

import java.util.List;

public interface IAgenceService {

    Agence addAgence(Agence agence);
    void deleteAgenceById(Long id);
    List<Agence> FindAll();
    Agence UpdateAgence(Agence agence);


}
