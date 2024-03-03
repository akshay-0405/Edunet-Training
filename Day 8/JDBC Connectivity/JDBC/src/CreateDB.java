import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

//JAR file configuration :-
//Project Structure -> Modules -> Dependencies ->
//<Module Source> -> + -> Jar & Directories -> Select your Jar file

public class CreateDB {
    public static void main(String[] args) {
        try {
            Connection obj = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "xxxxxx");
            System.out.println(obj);

            // Create Sql Query
            PreparedStatement ps = obj.prepareStatement("CREATE DATABASE JavaDB");

            // Execute Query
            ps.executeUpdate();
            System.out.println("Database Created!");

            // Close Connection
            obj.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

// Eclipse :
// New Project
// Package name -> nbn.ddl
// PSVM method

// class.forName("com.mysql.cj.jdbc.Driver");
// Connection con = DriverManager.getConnection("","","");
