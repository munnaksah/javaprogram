package jdbca1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBC {
	
	



	    public static void main(String[] args) throws SQLException, ClassNotFoundException {
	        // 2.Load and Register Driver
	        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	        // Database details MAVBNG1121155\SQLEXPRESS
	        String dbURL = "jdbc:sqlserver://MAVBNG1121155\\SQLEXPRESS:1433;;databaseName=University;encrypt=false;";
	        String User = "sa";
	        String password = "Munna@123";
	        // 3. Create Connection
	        Connection conn = DriverManager.getConnection(dbURL, User, password);
	        if (conn != null) {
	            System.out.println("Connected");
	        }



	       // 4. Create a Statement
	        String query = "select * from  EngineeringStudents  ";



	       Statement st = conn.createStatement();



	       // 5. Execute the Query
	        ResultSet res = st.executeQuery(query);
	        // 6. Process the results
	        res.next(); // rs.next() will make the pointer point to the first row as initially it is
	                    // pointed to column name
	        int Student_ID= res.getInt(1);
	        String First_Name = res.getString(3);



	       System.out.println("Student_ID :" +Student_ID);
	        System.out.println("First_Name :" + First_Name);
	    }
	}


