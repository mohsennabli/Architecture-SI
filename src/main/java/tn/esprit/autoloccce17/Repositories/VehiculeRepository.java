package tn.esprit.autoloccce17.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoloccce17.Entities.Maintenance;
@Repository
public interface VehiculeRepository extends JpaRepository<Maintenance,Long> {





}
