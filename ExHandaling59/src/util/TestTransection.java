package util;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestTransection {

    public static void main(String[] args) throws SQLException {

        

        String sql = "Select * from students where age=24";

        PreparedStatement ps = null;
        try {
            ps = DbUtil.getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println("name is " + rs.getString("name")
                        + " age is " + rs.getInt("age"));

            }

        } catch (SQLException ex) {
            Logger.getLogger(TestTransection.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            DbUtil.getCon().close();
            ps.close();
        }

    }

}
