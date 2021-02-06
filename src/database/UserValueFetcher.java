package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserValueFetcher {
    public User fetchUser(String email, Connection connection) {
        String FETCH_USER_QUERY = "select * from user where Email = ?;";
        ResultSet result = null;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(FETCH_USER_QUERY);
            preparedStatement.setString(1, email);
            result = preparedStatement.executeQuery();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        User user = null;
        if (result != null) {
            try {
                int id = 0;
                String emailString = null;
                String password = null;

                while (result.next()) {
                    id = result.getInt(1);
                    emailString = result.getString(2);
                    password = result.getString(3);
                    user = new User(id, emailString, password);
                }

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            } finally {
                System.out.println("User fetched");
            }
        }
        return user;
    }


}
