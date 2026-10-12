package tn.esprit.autoloccce17.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloccce17.Entities.Agence;
import tn.esprit.autoloccce17.Repositories.AgenceRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class AgenceService implements IAgenceService {
    AgenceRepository agencer;

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
