package models.decorator;

import models.reservation.Reservation;
public abstract class ReservationDecorator extends Reservation{
    protected Reservation decoratedReservation;
	public ReservationDecorator(Reservation decoratedReservation) {
		super(decoratedReservation.getCustomer(),decoratedReservation.getFlight(),decoratedReservation.getSeat(),decoratedReservation.getPricingStrategy());
		this.decoratedReservation=decoratedReservation;
	}
	@Override
	public void book() {
		System.out.println(decoratedReservation.getCustomer().getName());
	}
}
