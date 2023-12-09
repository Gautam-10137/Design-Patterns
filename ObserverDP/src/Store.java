import Observable.StocksObservable;
import Observable.IphoneObservableImpl;
import Observer.NotificationAlertObserver;
import Observer.EmailAlertObserverImpl;
import Observer.MobileAlertObserverImpl;


public class Store {

	public static void main(String[] args) {
		StocksObservable iphoneStocksObservable=new IphoneObservableImpl();
		
//		Customer 1
		NotificationAlertObserver observer1=new EmailAlertObserverImpl("gautampahwa47@gmail.com",iphoneStocksObservable);
//		Customer 2
		NotificationAlertObserver observer2=new EmailAlertObserverImpl("pahwagautam786@gmail.com",iphoneStocksObservable);
//      Customer 3
		NotificationAlertObserver observer3=new MobileAlertObserverImpl("GautamPahwa",iphoneStocksObservable);
        
		iphoneStocksObservable.add(observer1);
		iphoneStocksObservable.add(observer2);
		iphoneStocksObservable.add(observer3);
		
		iphoneStocksObservable.setStockCount(1000);
		iphoneStocksObservable.setStockCount(300);
		System.out.println(iphoneStocksObservable.getStockCount());
	}

}
