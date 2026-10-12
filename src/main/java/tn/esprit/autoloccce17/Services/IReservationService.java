package tn.esprit.autoloccce17.Services;

import tn.esprit.autoloccce17.Entities.Reservation;

import java.util.List;

public interface IReservationService {


    Reservation CreateReservation(Reservation reservation);
    void DeleteReservation(Reservation reservation);
    Reservation UpdateReservation(Reservation reservation);
    List<Reservation> findAllReservations();
}
