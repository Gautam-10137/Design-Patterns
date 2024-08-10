package models.reservation;

import models.Seat;
import models.observer.Customer;
import models.observer.Flight;
import models.strategy.PricingStrategy;

public class EconomyReservation extends Reservation {

	public EconomyReservation(Customer customer,Flight flight,Seat seat,PricingStrategy pricingStrategy) {
		super(customer,flight,seat,pricingStrategy);
	}
	
	public void book() {
		if(flight.reserveSeat(seat.getSeatNumber())) {
			System.out.println("Booking economy reservation for: "+getCustomer().getName());
		}
		else {
			System.out.println("Seat "+seat.getSeatNumber()+" is already reserved");
		}
	}
}

