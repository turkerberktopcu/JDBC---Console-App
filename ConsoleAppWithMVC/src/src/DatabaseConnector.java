package src;
import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnector {
	private static final String conUrl ="jdbc:sqlserver://LAPTOP-9L5664IA\\SQLSERVER; databaseName=ApartmentManagement; integratedSecurity=true; encrypt=true;trustServerCertificate=true";
	
	private static Connection DATABASE_CONNECTION;
	
	public static Connection getConnection() {
			
		try {
			DATABASE_CONNECTION = DriverManager.getConnection(conUrl);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		    return DATABASE_CONNECTION;
		
		
	}

}
