package Bank.Management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {
	
	Connection c;
	Statement s;
	
	Conn(){
		
		try{
			
		c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","root");
		s= c.createStatement();
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
		
	}
	
	

}
