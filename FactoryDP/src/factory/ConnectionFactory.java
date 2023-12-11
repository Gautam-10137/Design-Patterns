package factory;
import ConcreteClass.Connection;
import ConcreteClass.MySqlConnection;
import ConcreteClass.OracleConnection;
public class ConnectionFactory {
       public Connection createConnection(String connectionType) {
    	   if(connectionType==null) {
    		   return null;
    	   }
    	   if(connectionType.equalsIgnoreCase("MYSQL")) {
    		   return new MySqlConnection();
    	   }
    	   else if(connectionType.equalsIgnoreCase("ORACLE")) {
    		   return new OracleConnection();
    	   }
    	   return null;
       }
}
