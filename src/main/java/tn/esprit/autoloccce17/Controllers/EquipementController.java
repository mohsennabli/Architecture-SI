package tn.esprit.autoloccce17.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloccce17.Entities.Equipement;
import tn.esprit.autoloccce17.Services.IEquipementService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Equipements")
public class EquipementController {

    private IEquipementService equipementService;

    @PostMapping("/addEquipement")
    public Equipement addEquipement(@RequestBody Equipement equipement) {
        return equipementService.addEquipement(equipement);
    }

    @PutMapping("/updateEquipement")
    public Equipement updateEquipement(@RequestBody Equipement equipement) {
        return equipementService.updateEquipement(equipement);
    }

    @DeleteMapping("/deleteEquipement")
    public void deleteEquipement(@RequestBody Equipement equipement) {
        equipementService.deleteEquipement(equipement);
    }

    @GetMapping("/allEquipements")
    public List<Equipement> findAllEquipements() {
        return equipementService.findAllEquipements();
    }
}
