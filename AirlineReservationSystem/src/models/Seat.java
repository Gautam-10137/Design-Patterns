package models;

public class Seat {
    private String seatNumber;
    private boolean isAvailable;
    
    public Seat(String seatNumber) {
    	this.seatNumber=seatNumber;
    	this.isAvailable=true;
    }
    
    public String getSeatNumber() {
    	return seatNumber;
    }
    
    public boolean isAvailable() {
    	return isAvailable;
    }
    
    public void reserve() {
    	if(isAvailable) {
    		isAvailable=false;
    	}
    	else {
    		throw new IllegalStateException("Seat is already reserved");
    	}
    }
    
    public void cancel() {
    	if(!isAvailable) {
    		isAvailable=true;
    	}
    	else {
    		throw new IllegalStateException("Seat is not reserved");
    	}
    }
}
