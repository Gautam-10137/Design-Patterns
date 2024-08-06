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
		System.out.println("Booking first class reservation for: "+getCustomer().getName());
	}
}
