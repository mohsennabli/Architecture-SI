package tn.esprit.autoloccce17.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloccce17.Entities.Contrat;
import tn.esprit.autoloccce17.Services.IContratService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Contrats")
public class ContratController {

    private IContratService contratService;

    @PostMapping("/addContrat")
    public Contrat addContrat(@RequestBody Contrat contrat) {
        return contratService.addContrat(contrat);
    }

    @PutMapping("/updateContrat")
    public Contrat updateContrat(@RequestBody Contrat contrat) {
        return contratService.updateContrat(contrat);
    }

    @DeleteMapping("/deleteContrat")
    public void deleteContrat(@RequestBody Contrat contrat) {
        contratService.deleteContrat(contrat);
    }

    @GetMapping("/allContrats")
    public List<Contrat> findAllContrats() {
        return contratService.findAllContrats();
    }
}
