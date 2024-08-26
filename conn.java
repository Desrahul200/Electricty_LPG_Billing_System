import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement; 
public class conn {
	
	    Connection conn;
	    Statement s;
	    public  conn(){  
	        try{  
	            Class.forName("com.mysql.cj.jdbc.Driver");  
	            conn =DriverManager.getConnection("jdbc:mysql:///demo","root","12345");    
	            s =conn.createStatement();  
	            
	           
	        }catch(Exception e){ 
	            System.out.println(e);
	        }  
	    }  
	}  


