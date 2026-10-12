package tn.esprit.autoloccce17.Services;

import tn.esprit.autoloccce17.Entities.Employe;

import java.util.List;

public interface IEmployeeService {

    Employe addEmployee(Employe e);
    void deleteEmployee(Employe e);
    List<Employe> findAllEmployees();
    Employe updateEmployee(Employe e);

}
