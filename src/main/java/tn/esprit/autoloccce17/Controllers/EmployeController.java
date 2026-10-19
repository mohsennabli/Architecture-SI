package tn.esprit.autoloccce17.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloccce17.Entities.Employe;
import tn.esprit.autoloccce17.Services.IEmployeeService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Employes")
public class EmployeController {

    private IEmployeeService employeeService;

    @PostMapping("/addEmployee")
    public Employe addEmployee(@RequestBody Employe employe) {
        return employeeService.addEmployee(employe);
    }

    @PutMapping("/updateEmployee")
    public Employe updateEmployee(@RequestBody Employe employe) {
        return employeeService.updateEmployee(employe);
    }

    @DeleteMapping("/deleteEmployee")
    public void deleteEmployee(@RequestBody Employe employe) {
        employeeService.deleteEmployee(employe);
    }

    @GetMapping("/allEmployees")
    public List<Employe> findAllEmployees() {
        return employeeService.findAllEmployees();
    }
}
