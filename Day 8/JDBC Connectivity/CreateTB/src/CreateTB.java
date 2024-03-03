import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CreateTB {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/JavaDB";
            String user = "root";
            String pass = "xxxxxx";
            String query = "CREATE TABLE student(id int, name VARCHAR(20))";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, pass);
            PreparedStatement ps = con.prepareStatement(query);
            ps.execute();

            System.out.println("Table Created Successfully!");

            ps.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
