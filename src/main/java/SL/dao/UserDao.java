package SL.dao;

import SL.model.User;

import java.sql.SQLException;

/**
 * Created by anton on 3/18/17.
 */
public interface UserDao {

    User save(User user) throws SQLException;

    User getByName(User user);

    User update(User user);

    User remove(User user);
}
