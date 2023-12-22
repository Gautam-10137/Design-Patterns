package cost;
import java.time.Duration;
public class MinuteCostStrategy implements CostComputationStrategy{

	public CostDetails calculateCost(Duration duration) {
		double totalCost=duration.toMinutes()*0.3;  // Rs.0.3 per minute
		return new CostDetails(totalCost,duration);
	}
}
