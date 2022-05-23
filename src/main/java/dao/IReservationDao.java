package dao;

import entities.Reservation;

public interface IReservationDao {
    public Reservation addReservation(Reservation reservation) throws Exception;
}
