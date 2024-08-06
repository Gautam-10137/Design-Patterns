package models.factory;

import models.Seat;
import models.observer.Customer;
import models.observer.Flight;
import models.reservation.EconomyReservation;
import models.reservation.Reservation;
import models.strategy.PricingStrategy;

public class EconomyReservationFactory extends ReservationFactory {
    
	@Override
	public Reservation createReservation(Customer customer,Flight flight ,Seat seat,PricingStrategy pricingStrategy) {
		return new EconomyReservation(customer,flight,seat,pricingStrategy);
	};
}
