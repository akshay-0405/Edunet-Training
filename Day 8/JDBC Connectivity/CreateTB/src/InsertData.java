import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertData {
    public static void main(String[] args) {
        try {

            // int id =2;
            // String name = "Akshay";
            String url = "jdbc:mysql://localhost:3306/JavaDB";
            String user = "root";
            String pass = "xxxxxx";
            String query = "INSERT INTO STUDENT(ID,NAME) VALUES (01,'AK')";
            // String query = "INSERT INTO STUDENT(ID,NAME) VALUES ("+id+","+name+")";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, pass);
            PreparedStatement ps = con.prepareStatement(query);
            ps.execute();

            System.out.println("Data Inserted Successfully!");

            ps.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
