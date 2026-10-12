package tn.esprit.autoloccce17.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloccce17.Entities.Vehicule;

import java.util.List;
@Service
@AllArgsConstructor
public class VehiculeService implements IVehiculeService {
    @Override
    public Vehicule addVehicule(Vehicule vehicule) {
        return null;
    }

    @Override
    public void deleteVehicule(Vehicule vehicule) {

    }

    @Override
    public Vehicule updateVehicule(Vehicule vehicule) {
        return null;
    }

    @Override
    public List<Vehicule> findAllVehicules() {
        return List.of();
    }
}
