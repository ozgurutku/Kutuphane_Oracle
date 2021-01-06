package kütüphaneotomasyonu.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {

    private final String userName = "system";
    private final String password = "admin";
    private final String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl, userName, password);

    }

    public void showErrorMessage(SQLException exception) {
        System.out.println("Error:" + exception.getMessage());
        System.out.println("Error code:" + exception.getErrorCode());

    }

}
