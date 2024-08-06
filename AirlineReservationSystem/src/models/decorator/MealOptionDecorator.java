package models.decorator;

import models.reservation.Reservation;

public class MealOptionDecorator extends ReservationDecorator {

	public MealOptionDecorator(Reservation decoratedReservation) {
		super(decoratedReservation);
	}
	
	public void book() {
		super.book();	
	}
	
	public void addMealOption() {
		System.out.println("Adding meal option to reservation for: "+ decoratedReservation.getCustomer().getName());
	}
	
}
