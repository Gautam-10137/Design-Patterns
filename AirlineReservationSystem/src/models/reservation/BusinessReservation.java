package models.reservation;

import models.Seat;
import models.observer.Customer;
import models.observer.Flight;
import models.strategy.PricingStrategy;

public class BusinessReservation extends Reservation{

	public BusinessReservation(Customer customer,Flight flight,Seat seat,PricingStrategy pricingStrategy) {
		super(customer,flight,seat,pricingStrategy);
	}
	
	public void book() {
		System.out.println("Booking business class reservation for: "+getCustomer().getName());
	}
}
