package utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider 
{
	public static Connection conn;
	
	public static Connection getConnection()
	{
		try{
            Class.forName("org.h2.Driver");
            conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/User", "sa", "sa");
        }
        catch(Exception e)
		{
            System.out.println(e);
            e.printStackTrace();
        }
		return conn;
		
	}
	

}
