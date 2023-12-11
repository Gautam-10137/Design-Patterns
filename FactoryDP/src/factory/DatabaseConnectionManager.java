package factory;
import ConcreteClass.Connection;
public class DatabaseConnectionManager {
      private ConnectionFactory connectionFactory;
      
      public DatabaseConnectionManager(ConnectionFactory connectionFactory) {
    	  this.connectionFactory=connectionFactory;
      }
      public void setConnectionFactory(ConnectionFactory connectionFactory) {
    	  this.connectionFactory=connectionFactory;
      }
      public void connect(String connectionType) {
    	  Connection connection= connectionFactory.createConnection(connectionType);
    	  if(connection!=null) {
    		  connection.connect();
    	  }
    	  else {
    		  System.out.println("Invalid Connection type :"+connectionType);
    	  }
      }
}
