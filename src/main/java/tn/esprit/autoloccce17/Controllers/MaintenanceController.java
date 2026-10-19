package tn.esprit.autoloccce17.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloccce17.Entities.Equipement;
import tn.esprit.autoloccce17.Entities.Maintenance;
import tn.esprit.autoloccce17.Services.IMaintenanceService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Maintenances")
public class MaintenanceController {

    private IMaintenanceService maintenanceService;

    @PostMapping("/createMaintenance")
    public Maintenance createMaintenance(@RequestBody Equipement equipement) {
        return maintenanceService.createMaintenance(equipement);
    }

    @PutMapping("/updateMaintenance")
    public Maintenance updateMaintenance(@RequestBody Equipement equipement) {
        return maintenanceService.updateMaintenance(equipement);
    }

    @DeleteMapping("/deleteMaintenance")
    public void deleteMaintenance(@RequestBody Equipement equipement) {
        maintenanceService.deleteMaintenance(equipement);
    }

    @GetMapping("/allMaintenances")
    public List<Maintenance> findAllMaintenances() {
        return maintenanceService.findAllMaintenances();
    }
}
