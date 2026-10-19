package tn.esprit.autoloccce17.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloccce17.Entities.Agence;
import tn.esprit.autoloccce17.Repositories.AgenceRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class AgenceService implements IAgenceService {
    private AgenceRepository agenceRepository ;
    @Override
    public Agence ajouterAgence(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public void supprimerAgence(Long id) {
        agenceRepository.deleteById(id);
    }

    @Override
    public List<Agence> afficherAgences() {
        return agenceRepository.findAll();
    }

    @Override
    public Agence modifierAgence(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public Agence AfficherAgenceByID(Long id) {
        return  agenceRepository.findById(id).orElse(null);
    }

    @Override
    public Agence addAgence(Agence agence) {
        return null;
    }

    @Override
    public void deleteAgenceById(Long id) {

    }

    @Override
    public List<Agence> FindAll() {
        return List.of();
    }

    @Override
    public Agence UpdateAgence(Agence agence) {
        return null;
    }
}
