package models.factory;

import models.Seat;
import models.observer.Customer;
import models.observer.Flight;
import models.reservation.Reservation;

public abstract class ReservationFactory {

	public abstract Reservation createReservation(Customer cutomer,Flight flight,Seat seat);
}
