package peaksoft.config;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConfig {
    public static Connection getConnection() {
        try{
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres",
                    "1234");
        }catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
