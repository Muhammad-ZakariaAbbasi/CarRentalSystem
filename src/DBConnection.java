import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    public static Connection connect() {
        Connection conn = null;

        try {
            // Windows Authentication (no username and password needed)
            String url = "jdbc:sqlserver://localhost:1433;databaseName=CarRentalDB;integratedSecurity=true;encrypt=true;trustServerCertificate=true;";

            conn = DriverManager.getConnection(url);
            System.out.println("Connected to database successfully!");

        } catch (SQLException e) {
            System.out.println("Connection failed: " + e.getMessage());
        }

        return conn;
    }
}
