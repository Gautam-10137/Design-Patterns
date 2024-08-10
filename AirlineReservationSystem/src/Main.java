import models.decorator.*;
import models.observer.*;
import models.factory.*;
import models.reservation.*;
import models.singleton.*;
import models.strategy.*;

public class Main {

	public static void main(String[] args) {
		
		// creating customer and flight
		Customer customer1=new Customer("Gautam",2529);
		Flight flight1=new Flight("ASV12",20);
		
		// create factories
		ReservationFactory economyFactory=new EconomyReservationFactory();
		ReservationFactory businessFactory=new BusinessReservationFactory();
		ReservationFactory firstClassFactory=new FirstClassReservationFactory();
		
		// Pricing Strategy
		PricingStrategy regularPricing=new RegularPricingStrategy();
		PricingStrategy discountPricing=new DiscountPricingStrategy();
		
		
		// create reservations using factories
		Reservation economyReservation=economyFactory.createReservation(customer1, flight1, flight1.getSeat("Seat-1"), discountPricing);
		Reservation businessReservation=businessFactory.createReservation(customer1, flight1, flight1.getSeat("Seat-2"), regularPricing);
		Reservation firstClassReservation=firstClassFactory.createReservation(customer1, flight1, flight1.getSeat("Seat-3"), discountPricing);
		
		// adding observer
		flight1.addObserver(customer1);
		
		// decorated Reservation 
		Reservation economyWithMeal= new MealOptionDecorator(economyReservation);
		Reservation businessWithLuggage=new ExtraLuggageDecorator(businessReservation);
		
		// Book reservations
		firstClassReservation.book();
		firstClassReservation.book();
		economyWithMeal.book();
		businessWithLuggage.book();
		
		// using Reservation Manager
		ReservationManager reservationManager=ReservationManager.getInstance();
		reservationManager.addReservation(firstClassReservation);
		reservationManager.addReservation(economyWithMeal);
		reservationManager.addReservation(businessWithLuggage);
		
		flight1.setFlightStatus("Delayed");
		
		// calculating price
		double basePrice=100.0;
		System.out.println("Discount Price: "+economyReservation.getPrice(basePrice));
		economyReservation.setPricingStrategy(regularPricing);
		System.out.println("Regular Price: "+economyReservation.getPrice(basePrice));
		
		// cancel Reservation
		economyWithMeal.cancel();
		
		
	}

}
