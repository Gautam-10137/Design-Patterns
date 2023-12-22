package gate;
import ParkingLot.Vehicle;
import controller.ParkingLotController;
import ParkingLot.Ticket;
public class EntryGate extends Gate {
	
	public ParkingLotController parkingLotController;
	
	public EntryGate(int gateId,ParkingLotController parkingLotController) {
	   super(gateId);
	   this.parkingLotController=parkingLotController;
	}
    
	public void processVehicle(Vehicle vehicle) {
		super(vehicle);
	}
}
