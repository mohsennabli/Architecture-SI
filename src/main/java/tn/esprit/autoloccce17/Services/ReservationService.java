package tn.esprit.autoloccce17.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloccce17.Entities.Reservation;

import java.util.List;
@Service
@AllArgsConstructor
public class ReservationService implements IReservationService {
    @Override
    public Reservation CreateReservation(Reservation reservation) {
        return null;
    }

    @Override
    public void DeleteReservation(Reservation reservation) {

    }

    @Override
    public Reservation UpdateReservation(Reservation reservation) {
        return null;
    }

    @Override
    public List<Reservation> findAllReservations() {
        return List.of();
    }
}
