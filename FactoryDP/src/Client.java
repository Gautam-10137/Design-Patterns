import ConcreteClass.Connection;
import factory.ConnectionFactory;
import factory.DatabaseConnectionManager;
public class Client  {

	public static void main(String[] args) {
		ConnectionFactory connectionFactory=new ConnectionFactory();
		DatabaseConnectionManager connectionManager=new DatabaseConnectionManager(connectionFactory);
		
		connectionManager.connect("MySQL");
		connectionManager.connect("ORACLE");
		
//		Here We can implement another CustomConnectionFactory
//		connectionManager.setConnectionFactory(new CustomConnectionFactory());
//		connectionManager.connect("CUSTOM");
                    
	}

}
