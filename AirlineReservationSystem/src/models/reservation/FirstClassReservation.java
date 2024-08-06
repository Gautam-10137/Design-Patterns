package models.reservation;

import models.Seat;
import models.observer.Customer;
import models.observer.Flight;

public class FirstClassReservation extends Reservation {
    
	public FirstClassReservation(Customer customer,Flight flight,Seat seat) {
		super(customer, flight, seat);
	}
	
	public void book() {
		System.out.println("Booking first class reservation for: "+getCustomer().getName());
	}
}
