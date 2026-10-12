package tn.esprit.autoloccce17.Services;

import tn.esprit.autoloccce17.Entities.Equipement;

import java.util.List;

public interface IEquipementService {

    Equipement addEquipement(Equipement equipement);
    void deleteEquipement(Equipement equipement);
    List<Equipement> findAllEquipements();
    Equipement updateEquipement(Equipement equipement);

}
