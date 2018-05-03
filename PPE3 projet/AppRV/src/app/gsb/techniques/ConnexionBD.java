package app.gsb.techniques;
import java.sql.*;

public class ConnexionBD {
	
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://localhost/GsbCRSlamV2015";
	
	static final String USER = "root";
	static final String PASS = "azerty";
	private static Connection connexion = null;
	
	private ConnexionBD() throws ConnexionException{
		
		try{
			
			Class.forName(JDBC_DRIVER);
			connexion = (Connection) DriverManager.getConnection(DB_URL,USER,PASS);
			
		}catch(Exception e){
			
			System.out.println("Erreur ! :" + e.getMessage());
			throw new ConnexionException();
		}
		
	}
	
	public static Connection getConnexion() throws ConnexionException{
		
		if(connexion == null){
			
			new ConnexionBD();
		}
		
		return connexion ;
	}
}
