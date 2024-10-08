package models.reservation;

import models.Seat;
import models.observer.Customer;
import models.observer.Flight;
import models.strategy.PricingStrategy;

public abstract class Reservation {
	protected Customer customer;
	protected Flight flight;
	protected Seat seat;
	protected PricingStrategy pricingStrategy;

	public Reservation(Customer customer, Flight flight, Seat seat,PricingStrategy pricingStrategy) {
		this.customer=customer;
		this.flight=flight;
		this.seat=seat;
		this.pricingStrategy=pricingStrategy;
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

	public PricingStrategy getPricingStrategy() {
		return pricingStrategy;
	}

	public void setPricingStrategy(PricingStrategy pricingStrategy) {
		this.pricingStrategy = pricingStrategy;
	}

	public void setSeat(Seat seat) {
		this.seat = seat;
	}
	
	public double getPrice(double basePrice) {
		return pricingStrategy.calculatePrice(basePrice);
	}
	
	public void cancel() {
		flight.cancelSeatReservation(seat.getSeatNumber());
		System.out.println("Rservation for customer:"+customer.getName()+" for seat:"+seat.getSeatNumber()+" has been cancelled");
	}

}
