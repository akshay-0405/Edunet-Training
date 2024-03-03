import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Retrieve {
    public static void main(String[] args) {
        try {

            String url = "jdbc:mysql://localhost:3306/JavaDB";
            String user = "root";
            String pass = "xxxxxx";
            String query = "SELECT * FROM STUDENT";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, pass);
            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();// array returned

            while (rs.next()) {
                int idl = rs.getInt("id");
                String namel = rs.getString("name");
                System.out.println("Id of Student : " + idl + "\nName of Student : " + namel);
            }

            System.out.println("Data Retrieved Successfully!");

            ps.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
