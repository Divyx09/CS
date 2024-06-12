import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnectivity {
    public static void main(String[] args) {
        // Database credentials
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "password";

        // Load the MySQL JDBC driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Error loading JDBC driver: " + e.getMessage());
            return;
        }

        // Establish a connection to the database
        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            System.out.println("Connected to the database!");
        } catch (SQLException e) {
            System.out.println("Error connecting to the database: " + e.getMessage());
        }
    }
}