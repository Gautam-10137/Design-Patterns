package models.observer;

public class Customer implements observer {
     private String name;
     private int customerId;
     
     public Customer(String name,int customerId) {
    	 this.name=name;
    	 this.customerId=customerId;
     }
     
     public String getName() {
    	 return name;
     }
     
     public int getId() {
    	 return customerId;
     }
     
     public void update(String status) {
    	 System.out.println("Notifying: "+name+" of flight status:"+status);
     }

}
