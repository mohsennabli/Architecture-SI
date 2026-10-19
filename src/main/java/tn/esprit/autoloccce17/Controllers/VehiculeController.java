package tn.esprit.autoloccce17.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloccce17.Entities.Vehicule;
import tn.esprit.autoloccce17.Services.IVehiculeService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Vehicules")
public class VehiculeController {

    private IVehiculeService vehiculeService;

    @PostMapping("/addVehicule")
    public Vehicule addVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeService.addVehicule(vehicule);
    }

    @PutMapping("/updateVehicule")
    public Vehicule updateVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeService.updateVehicule(vehicule);
    }

    @DeleteMapping("/deleteVehicule")
    public void deleteVehicule(@RequestBody Vehicule vehicule) {
        vehiculeService.deleteVehicule(vehicule);
    }

    @GetMapping("/allVehicules")
    public List<Vehicule> findAllVehicules() {
        return vehiculeService.findAllVehicules();
    }
}
