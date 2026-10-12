package tn.esprit.autoloccce17.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloccce17.Entities.Contrat;

import java.util.List;
@Service
@AllArgsConstructor
public class ContratService implements IContratService {

    @Override
    public Contrat addContrat(Contrat contrat) {
        return null;
    }

    @Override
    public void deleteContrat(Contrat contrat) {

    }

    @Override
    public Contrat updateContrat(Contrat contrat) {
        return null;
    }

    @Override
    public List<Contrat> findAllContrats() {
        return List.of();
    }
}
