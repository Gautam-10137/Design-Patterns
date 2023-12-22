package ParkingLot;
import java.util.List;
import java.util.ArrayList;
import controller.ParkingLotController;
public class ParkingLotFactory {
   public ParkingLotController createParkingLot(int numTwoWheelerVehicles, int numFourWheelerVehicles) {
	   List<ParkingSlot>twoWheelerSlots=createSlots(numTwoWheelerVehicles,TWO_WHEELER);
   }
   private List<ParkingSlot>createSlots(int numSlots,VehicleType vehicleType){
	   List<ParkingSlot>parkingSlots=new ArrayList<>();
	   for(int i=1;i<=numSlots;i++) {
		   parkingSlots.add(new ParkingSlot(i,false,vehicleType));
	   }
	   return parkingSlots;
   }
   
}
