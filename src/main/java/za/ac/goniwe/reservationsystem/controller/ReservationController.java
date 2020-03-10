package za.ac.goniwe.reservationsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.goniwe.reservationsystem.domain.Reservation;
import za.ac.goniwe.reservationsystem.service.ReservationService;

import java.util.List;

@RestController
@RequestMapping("/reserve/v1")
public class ReservationController {
    @Autowired
    private ReservationService reservationService;

    @GetMapping("/getAll")
    public List getAllReservations(){
        return this.reservationService.getAllReservations();
    }

    @GetMapping("/get/{id}")
    public Reservation getReservation(@PathVariable("id") Long id){
        return this.reservationService.getReservation(id);
    }

    @PostMapping("/add")
    public void addReservation(@RequestBody Reservation reservation){
        this.reservationService.addReservation(reservation);
    }

    @PutMapping("/update/{id}")
    public void updateReservation(@RequestBody Reservation reservation, @PathVariable("id") Long id){
        this.reservationService.updateReservation(id, reservation);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteReservation(@PathVariable("id") Long id){
        this.reservationService.deleteReservation(id);
    }
}
