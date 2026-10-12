package tn.esprit.autoloccce17.Services;

import tn.esprit.autoloccce17.Entities.Vehicule;

import java.util.List;

public interface IVehiculeService {

    Vehicule addVehicule(Vehicule vehicule);
    void deleteVehicule(Vehicule vehicule);
    Vehicule updateVehicule(Vehicule vehicule);
    List<Vehicule> findAllVehicules();
}
