package models.reservation;

import models.Seat;
import models.observer.Customer;
import models.observer.Flight;
import models.strategy.PricingStrategy;

public class FirstClassReservation extends Reservation {
    
	public FirstClassReservation(Customer customer,Flight flight,Seat seat,PricingStrategy pricingStrategy) {
		super(customer, flight, seat,pricingStrategy);
	}
	
	public void book() {
		if(flight.reserveSeat(seat.getSeatNumber())) {
			System.out.println("Booking First reservation for: "+getCustomer().getName());
		}
		else {
			System.out.println("Seat "+seat.getSeatNumber()+" is already reserved");
		}
	}
}
