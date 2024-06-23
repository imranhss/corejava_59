package dbcrud2;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DbUtil;

public class DBCrud2 {

    public static DbUtil db = new DbUtil();
    static PreparedStatement ps;
    static ResultSet rs;
    static String sql = "";

    public static void main(String[] args) {

//        saveEmp("Raju", "raju@gmail.com", "Azimpur", "123456789");
//        System.out.println("\n After insert \n");
        showEmp();
        deleteEmp(4);
        System.out.println("\n After Delete \n");
        showEmp();
        
        
        updateEmp("Sanaullah", "sanaullah@gmail.com", "Chapai Nobabgong", "987654321", 3);
        
        System.out.println("\n After Update \n");
        showEmp();

    }

    public static void saveEmp(String name, String email, String address, String cellno) {
        sql = "insert into employee(name, email, address, cellno)"
                + " values(?,?,?,?)";

        try {
            ps = db.getCon().prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, address);
            ps.setString(4, cellno);

            ps.executeUpdate();

            ps.close();
            db.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(DBCrud2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void showEmp() {

        sql = "select * from employee";
        try {
            ps = db.getCon().prepareStatement(sql);

            rs = ps.executeQuery();

            while (rs.next()) {
                String name = rs.getString("name");
                String email = rs.getString("email");
                String address = rs.getString("address");
                String cellno = rs.getString("cellno");
                String empid = rs.getString("empid");

                System.out.println("Emp ID: " + empid + " \tName: " + name + "\t Email: " + email + " \tAddress: " + address + " \tCell No: " + cellno);

            }

            ps.close();
            rs.close();
            db.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(DBCrud2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void deleteEmp(int empid) {
        sql = "delete from employee where empid=?";
        try {
            ps = db.getCon().prepareStatement(sql);
            ps.setInt(1, empid);

            ps.executeUpdate();

            ps.close();
            db.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(DBCrud2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void updateEmp(String name, String email, String address, String cellno, int empid) {

        sql = "update employee set name=?, email=?, address=?, cellno=? where empid=?";
        try {
            ps = db.getCon().prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, address);
            ps.setString(4, cellno);
            ps.setInt(5, empid);

            ps.executeUpdate();
            
            ps.close();
            db.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(DBCrud2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
