package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/login?serverTimezone=UTC";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private Connection connection;

    public Connection getConnection() {
        return connection;
    }

    public Boolean createConnection() {
        return createConnection(URL, USERNAME, PASSWORD);

    }

    public Boolean createConnection(String url, String username, String password) {
        try {
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("connection has been created");
        } catch (SQLException throwables) {
            System.err.println("Couldnot connect to Database");
            System.err.println(throwables.getMessage());
        }
        return connection != null;
    }

}
//ctrl+alt+shift+L ... format
