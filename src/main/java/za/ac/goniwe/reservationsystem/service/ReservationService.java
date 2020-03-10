package za.ac.goniwe.reservationsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.goniwe.reservationsystem.domain.Reservation;
import za.ac.goniwe.reservationsystem.repository.ReservationRepository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class ReservationService {
    @Autowired
    private ReservationRepository reservationRepository;

    public List getAllReservations(){
        List reservations = new ArrayList();
        this.reservationRepository.findAll().forEach(reservations::add);
        return reservations;
    }

    public Reservation getReservation(Long id){
        return this.reservationRepository.findById(id).get();
    }

    public void addReservation(Reservation reservation){
        this.reservationRepository.save(reservation);
    }

    public void updateReservation(Long id, Reservation reservation){
        this.reservationRepository.save(reservation);
    }

    public void deleteReservation(Long id){
        this.reservationRepository.deleteById(id);
    }
}
