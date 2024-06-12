import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseConnect {
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

            // Create a statement object
            Statement stmt = conn.createStatement();

            // Execute a query to retrieve data from the database
            ResultSet rs = stmt.executeQuery("SELECT * FROM mytable");

            // Print the results
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name"));
            }

            // Close the statement and connection
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Error connecting to the database: " + e.getMessage());
        }
    }
}