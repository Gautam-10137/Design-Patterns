package models.factory;

import models.Seat;
import models.observer.Customer;
import models.observer.Flight;
import models.reservation.BusinessReservation;
import models.reservation.Reservation;

public class BusinessReservationFactory extends ReservationFactory{

	public Reservation createReservation(Customer customer,Flight flight,Seat seat) {
		return new BusinessReservation(customer,flight,seat);
	}
}
