package models.factory;

import models.Seat;
import models.observer.Customer;
import models.observer.Flight;
import models.reservation.FirstClassReservation;
import models.reservation.Reservation;
import models.strategy.PricingStrategy;

public class FirstClassReservationFactory extends ReservationFactory {

	public Reservation createReservation(Customer customer,Flight flight,Seat seat,PricingStrategy pricingStrategy) {
		return new FirstClassReservation(customer,flight,seat,pricingStrategy);
	}
}
