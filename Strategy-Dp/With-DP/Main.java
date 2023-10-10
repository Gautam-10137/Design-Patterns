
public class Main {

	public static void main(String[] args) {
		Vehicle v1=new GoodsVehicle();
		v1.drive();
		
		Vehicle v2=new OffRoadVehicle();
		v2.drive();
		
		Vehicle v3= new SportsVehicle();
		v3.drive();
	}

}
