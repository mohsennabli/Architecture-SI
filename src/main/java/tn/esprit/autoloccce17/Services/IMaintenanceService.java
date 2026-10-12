package tn.esprit.autoloccce17.Services;

import tn.esprit.autoloccce17.Entities.Equipement;
import tn.esprit.autoloccce17.Entities.Maintenance;

import java.util.List;

public interface IMaintenanceService {

    Maintenance createMaintenance(Equipement equipement);
    void deleteMaintenance(Equipement equipement);
    Maintenance updateMaintenance(Equipement equipement);
    List<Maintenance> findAllMaintenances();
}
