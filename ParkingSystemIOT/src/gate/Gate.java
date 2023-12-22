package gate;
import ParkingLot.Vehicle;
public class Gate {
   private int gateId;
   
   public Gate(int gateId) {
	   this.gateId=gateId;
   }
   public void processVehicle(Vehicle vehicle) {
	   System.out.println("Processing vehicle at gate");
   }
}
