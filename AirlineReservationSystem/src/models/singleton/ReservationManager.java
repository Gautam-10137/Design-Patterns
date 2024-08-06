package models.singleton;

import java.util.ArrayList;
import java.util.List;

import models.reservation.Reservation;

public class ReservationManager {
	
	 private static ReservationManager instance;
	 private List<Reservation> reservations;
	 
	 public ReservationManager() {
		 this.reservations=new ArrayList<>();
		
	 }
	 
	 public static synchronized ReservationManager getInstance() {
		 if(instance==null) {
			 instance=new ReservationManager();
			 return instance;
		 }
			 return instance;
	 }
	 
	 public void addReservation(Reservation reservation) {
		 reservations.add(reservation);
	 }

}
