package tn.esprit.autoloccce17.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloccce17.Entities.Equipement;
import tn.esprit.autoloccce17.Entities.Paiement;

import java.util.List;
@Service
@AllArgsConstructor
public class PaiementService implements IPaiementService {
    @Override
    public Paiement createPaiement(Equipement equipement) {
        return null;
    }

    @Override
    public void deletePaiement(Equipement equipement) {

    }

    @Override
    public List<Paiement> findAllPaiements() {
        return List.of();
    }

    @Override
    public Paiement UpdatePaiement(Equipement equipement) {
        return null;
    }
}
