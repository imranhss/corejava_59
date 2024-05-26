
package testjdbc59;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TestJDBC59 {

   
    public static void main(String[] args) {
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
             
            Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3307/testjdbc59", "root", "1234");
            
            PreparedStatement ps=connection.prepareStatement("Select * from student");
            
            ResultSet rs=ps.executeQuery();
            
           
            
            while(rs.next()){
                System.out.println(rs.getInt("id")+" "+rs.getString("Name")
                +" "+rs.getString("email")+" "+rs.getString("address"));
            
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TestJDBC59.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TestJDBC59.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
    }
    
}
