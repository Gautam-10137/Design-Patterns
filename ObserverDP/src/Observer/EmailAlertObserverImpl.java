package Observer;
import Observable.StocksObservable;
public class EmailAlertObserverImpl implements NotificationAlertObserver{
      StocksObservable observable;
      String emailId;
      
      public EmailAlertObserverImpl(String emailId,StocksObservable obj) {
    	    this.emailId=emailId;
    	    this.observable=obj;
      }
      @Override
      public void update() { 
    	  sendMail(emailId,"product is in Stock, Hurry up!");
      }
      public void sendMail(String emailId,String msg) {
    	  System.out.println("mail sent to:"+emailId);
        //  Send Actual Mail to end user
      }
      
}
