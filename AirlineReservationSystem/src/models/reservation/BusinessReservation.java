package models.reservation;

import models.Seat;
import models.observer.Customer;
import models.observer.Flight;

public class BusinessReservation extends Reservation{

	public BusinessReservation(Customer customer,Flight flight,Seat seat) {
		super(customer,flight,seat);
	}
	
	public void book() {
		System.out.println("Booking business class reservation for: "+getCustomer().getName());
	}
}
