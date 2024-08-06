package models.factory;

import models.Seat;
import models.observer.Customer;
import models.observer.Flight;
import models.reservation.BusinessReservation;
import models.reservation.Reservation;
import models.strategy.PricingStrategy;

public class BusinessReservationFactory extends ReservationFactory{

	public Reservation createReservation(Customer customer,Flight flight,Seat seat,PricingStrategy pricingStrategy) {
		return new BusinessReservation(customer,flight,seat,pricingStrategy);
	}
}
