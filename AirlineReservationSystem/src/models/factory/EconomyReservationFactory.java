package models.factory;

import models.Seat;
import models.observer.Customer;
import models.observer.Flight;
import models.reservation.EconomyReservation;
import models.reservation.Reservation;

public class EconomyReservationFactory extends ReservationFactory {
    
	@Override
	public Reservation createReservation(Customer customer,Flight flight ,Seat seat) {
		return new EconomyReservation(customer,flight,seat);
	};
}
