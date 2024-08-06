package models.reservation;

import models.Seat;
import models.observer.Customer;
import models.observer.Flight;

public class EconomyReservation extends Reservation {

	public EconomyReservation(Customer customer,Flight flight,Seat seat) {
		super(customer,flight,seat);
	}
	
	public void book() {
		System.out.println("Booking economy reservation for: "+getCustomer().getName());
	}
}

