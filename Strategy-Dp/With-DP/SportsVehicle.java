
import Strategy.SportDriveStrategy;
public class SportsVehicle extends Vehicle{
   SportsVehicle(){
	   super(new SportDriveStrategy());
   }
}
