import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseSetup {
    // JDBC URL, username, and password of MySQL server
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/ConnectToJava";
    private static final String USER = "root";
    private static final String PASSWORD = "4235";

    public static void main(String[] args) {
        Connection connection = null;
        try {
            // 1. Setup the connection
            connection = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
            System.out.println("Connection successful.");

            // 3. Create database
            createDatabase(connection, "test_db");

            // 4. Create table
            createTable(connection);

            // 5. Create columns (This could be part of table creation)
            createColumns(connection);
        } catch (SQLException e) {
            System.out.println("Connection failed.");
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private static void createDatabase(Connection connection, String dbName) throws SQLException {
        Statement statement = connection.createStatement();
        String query = "CREATE DATABASE IF NOT EXISTS " + dbName;
        statement.executeUpdate(query);
        System.out.println("Database created successfully.");
    }

    private static void createTable(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        String query = "CREATE TABLE IF NOT EXISTS test_table (" +
                "id INT AUTO_INCREMENT PRIMARY KEY," +
                "name VARCHAR(255) NOT NULL)";
        statement.executeUpdate(query);
        System.out.println("Table created successfully.");
    }

    private static void createColumns(Connection connection) throws SQLException {
        // In this example, columns are created along with the table creation.
        // But you can add separate methods to alter table and add columns later.
        // This method is just for demonstration purposes.
        System.out.println("Columns created successfully.");
    }
}
