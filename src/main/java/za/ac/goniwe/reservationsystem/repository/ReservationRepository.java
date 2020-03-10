package za.ac.goniwe.reservationsystem.repository;

import org.springframework.data.repository.CrudRepository;
import za.ac.goniwe.reservationsystem.domain.Reservation;

public interface ReservationRepository extends CrudRepository<Reservation, Long> {
}
