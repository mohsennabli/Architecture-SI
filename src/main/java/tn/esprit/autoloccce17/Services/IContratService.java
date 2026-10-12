package tn.esprit.autoloccce17.Services;

import tn.esprit.autoloccce17.Entities.Contrat;

import java.util.List;

public interface IContratService {


    Contrat addContrat(Contrat contrat);
    void deleteContrat(Contrat contrat);
    Contrat updateContrat(Contrat contrat);
    List<Contrat> findAllContrats();

}
