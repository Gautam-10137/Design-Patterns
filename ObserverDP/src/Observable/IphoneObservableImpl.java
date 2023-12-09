package Observable;
import Observer.NotificationAlertObserver;
import java.util.List;
import java.util.ArrayList;
public class IphoneObservableImpl  implements StocksObservable{
    public List<NotificationAlertObserver> ObserverList=new ArrayList<>();
    public int stockCount=0;
    
    @Override
    public void add(NotificationAlertObserver observer) {
    	ObserverList.add(observer);
    }
    
    @Override
    public void remove(NotificationAlertObserver observer) {
    	ObserverList.remove(observer);
    }
    
    @Override
    public void notifySubscribers() {
    	for(NotificationAlertObserver observer: ObserverList) {
    		observer.update();
    	}
    }
    
    public void setStockCount(int newStockAdded) {
    	if(stockCount==0) {
    		notifySubscribers();
    	}
    	stockCount=stockCount+newStockAdded;
    }
    public int getStockCount() {
    	return stockCount;
    }
}
