package models.reservation;

import models.Seat;
import models.observer.Customer;
import models.observer.Flight;

public abstract class Reservation {
	private Customer customer;
	private Flight flight;
	private Seat seat;

	public Reservation(Customer customer, Flight flight, Seat seat) {
		this.setCustomer(customer);
		this.setFlight(flight);
		this.setSeat(seat);
	}

	public abstract void book();

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public Seat getSeat() {
		return seat;
	}

	public void setSeat(Seat seat) {
		this.seat = seat;
	}

}
