package tn.esprit.autoloccce17.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloccce17.Entities.Reservation;
import tn.esprit.autoloccce17.Services.IReservationService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Reservations")
public class ReservationController {

    private IReservationService reservationService;

    @PostMapping("/createReservation")
    public Reservation createReservation(@RequestBody Reservation reservation) {
        return reservationService.CreateReservation(reservation);
    }

    @PutMapping("/updateReservation")
    public Reservation updateReservation(@RequestBody Reservation reservation) {
        return reservationService.UpdateReservation(reservation);
    }

    @DeleteMapping("/deleteReservation")
    public void deleteReservation(@RequestBody Reservation reservation) {
        reservationService.DeleteReservation(reservation);
    }

    @GetMapping("/allReservations")
    public List<Reservation> findAllReservations() {
        return reservationService.findAllReservations();
    }
}
