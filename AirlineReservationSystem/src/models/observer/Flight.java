package models.observer;

import java.util.ArrayList;
import java.util.List;

import models.Seat;

public class Flight implements notifiable {

	private String flightNumber;
	private List<Seat>seats;
	private List<Customer>customers;
	private String flightStatus;
	
	public Flight(String flightNumber,int numberOfSeats) {
		this.flightNumber=flightNumber;
		this.seats=new ArrayList<>();
		for(int i=1;i<=numberOfSeats;i++){
			seats.add(new Seat("Seat-"+i));
		}
		this.customers=new ArrayList<>();
	}
	
	public String getFlightNumber() {
		return flightNumber;
	}
	
	public List<Seat> getSeats(){
		return seats;
	}
	
	public Seat getSeat(String seatNumber) {
		for(Seat seat:seats) {
			if(seat.getSeatNumber().equals(seatNumber)) {
				return seat;
			}
		}
	    throw new IllegalStateException("Seat not found");
	}
	
	public void addObserver(Customer customer) {
		customers.add(customer);
	}
	
	public void removeObserver(Customer customer) {
		customers.remove(customer);
	}
	
	public void setFlightStatus(String flightStatus) {
		this.flightStatus=flightStatus;
		notifyAllObservers();
	}
	
	public void notifyAllObservers() {
		for(Customer customer:customers) {
			customer.update(flightStatus);
		}
	}
	
	public boolean reserveSeat(String seatNumber) {
		Seat seat=getSeat(seatNumber);
		if(seat.isAvailable()) {
			seat.reserve();
			return true;
		}
		return false;
	}
	
	public void cancelSeatReservation(String seatNumber) {
		Seat seat=getSeat(seatNumber);
		seat.cancel();
	}
	
}
