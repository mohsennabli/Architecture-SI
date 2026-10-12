package tn.esprit.autoloccce17.Services;

import tn.esprit.autoloccce17.Entities.Equipement;
import tn.esprit.autoloccce17.Entities.Paiement;

import java.util.List;

public interface IPaiementService {

    Paiement createPaiement(Equipement equipement);
    void deletePaiement(Equipement equipement);
    List<Paiement> findAllPaiements();
    Paiement UpdatePaiement(Equipement equipement);

}
