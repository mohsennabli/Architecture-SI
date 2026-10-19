package tn.esprit.autoloccce17.Services;

import tn.esprit.autoloccce17.Entities.Agence;

import java.util.List;

public interface IAgenceService {

    Agence ajouterAgence(Agence agence);

    void supprimerAgence(Long id);

    List<Agence> afficherAgences();

    Agence modifierAgence(Agence agence);

    Agence AfficherAgenceByID(Long id);

    Agence addAgence(Agence agence);
    void deleteAgenceById(Long id);
    List<Agence> FindAll();
    Agence UpdateAgence(Agence agence);


}
