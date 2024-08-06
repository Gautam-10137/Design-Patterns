package models.decorator;

import models.reservation.Reservation;

public class ExtraLuggageDecorator extends ReservationDecorator {

	public ExtraLuggageDecorator(Reservation decoratedReservation) {
		super(decoratedReservation);
	}
	
	@Override
	public void book() {
		super.book();
		addExtraLuggage();
	}
	public void addExtraLuggage() {
		System.out.println("Adding extra luggage to reservation for: "+decoratedReservation.getCustomer().getName());
	}
}
