package tn.esprit.autoloccce17.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloccce17.Entities.Equipement;
import tn.esprit.autoloccce17.Entities.Paiement;
import tn.esprit.autoloccce17.Services.IPaiementService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Paiements")
public class PaiementController {

    private IPaiementService paiementService;

    @PostMapping("/createPaiement")
    public Paiement createPaiement(@RequestBody Equipement equipement) {
        return paiementService.createPaiement(equipement);
    }

    @PutMapping("/updatePaiement")
    public Paiement updatePaiement(@RequestBody Equipement equipement) {
        return paiementService.UpdatePaiement(equipement);
    }

    @DeleteMapping("/deletePaiement")
    public void deletePaiement(@RequestBody Equipement equipement) {
        paiementService.deletePaiement(equipement);
    }

    @GetMapping("/allPaiements")
    public List<Paiement> findAllPaiements() {
        return paiementService.findAllPaiements();
    }
}
