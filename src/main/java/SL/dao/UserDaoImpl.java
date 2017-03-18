package SL.dao;

import SL.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by anton on 3/18/17.
 */
public class UserDaoImpl implements UserDao{

    private final Connection connection;

    public UserDaoImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public User save(User user) throws SQLException {

        String query = "INSERT INTO USERS VALUES (?, ?, ?)";

        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, user.getUsername());
        statement.setString(2, user.getPassword());
        statement.setString(3, user.getEmail());
        statement.executeUpdate();

        return user;
    }

    @Override
    public User getByName(User user) {
        return null;
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public User remove(User user) {
        return null;
    }
}
