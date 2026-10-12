package tn.esprit.autoloccce17.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloccce17.Entities.Employe;

import java.util.List;
@Service
@AllArgsConstructor
public class EmployeService implements IEmployeeService{
    @Override
    public Employe addEmployee(Employe e) {
        return null;
    }

    @Override
    public void deleteEmployee(Employe e) {

    }

    @Override
    public List<Employe> findAllEmployees() {
        return List.of();
    }

    @Override
    public Employe updateEmployee(Employe e) {
        return null;
    }
}
