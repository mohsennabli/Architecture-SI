package tn.esprit.autoloccce17.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity @Getter
@Setter @AllArgsConstructor @NoArgsConstructor
public class Agence {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long idAgence;
    String nom;
    String ville;
    String adresse;
    String telephone;

    @OneToMany(mappedBy = "agence", cascade = CascadeType.ALL)
    List<Employe> employes = new ArrayList<>();

    @OneToMany(mappedBy = "agence")
    List<Vehicule> vehicules = new ArrayList<>();
}