package Observer;
import Observable.StocksObservable;
public class MobileAlertObserverImpl implements NotificationAlertObserver {
        String username;
        StocksObservable observable;
        
        public MobileAlertObserverImpl(String username,StocksObservable obj) {
        	this.username=username;
        	this.observable=obj;
        }
        @Override
        public void update() {
        	sendMsgOnMobile(username,"product is in Stock, Hurry Up!");
        }
        
        public void sendMsgOnMobile(String username,String msg) {
        	System.out.println("msg sent to :"+username);
//        	Send Actual message to end user
        }
        
}
