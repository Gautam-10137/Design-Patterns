import Strategy.SportDriveStrategy;
public class OffRoadVehicle  extends Vehicle{
     OffRoadVehicle(){
    	 super(new SportDriveStrategy());
     }
}
