package tn.esprit.autoloccce17.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloccce17.Entities.Equipement;

import java.util.List;
@Service
@AllArgsConstructor
public class EquipementService implements IEquipementService {

    @Override
    public Equipement addEquipement(Equipement equipement) {
        return null;
    }

    @Override
    public void deleteEquipement(Equipement equipement) {

    }

    @Override
    public List<Equipement> findAllEquipements() {
        return List.of();
    }

    @Override
    public Equipement updateEquipement(Equipement equipement) {
        return null;
    }
}
