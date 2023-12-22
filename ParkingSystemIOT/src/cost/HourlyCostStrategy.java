package cost;
import java.time.Duration;
public class HourlyCostStrategy implements CostComputationStrategy{

	public CostDetails calculateCost(Duration duration) {
		double totalCost=duration.toHours()*20;   // Rs.20 per hour
		return new CostDetails(totalCost,duration);
	}
	
	
}
