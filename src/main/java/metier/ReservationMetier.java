package metier;

import entities.Reservation;
import entities.ReservationDetails;

public interface ReservationMetier {
    public Reservation reservation(Reservation reservation, ReservationDetails details) throws Exception;
}
