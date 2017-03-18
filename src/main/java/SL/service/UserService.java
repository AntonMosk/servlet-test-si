package SL.service;

import SL.model.User;

import java.sql.SQLException;

/**
 * Created by anton on 3/18/17.
 */
public interface UserService {

    User save(User user);

    User getByName(User user);

    User update(User user);

    User remove(User user);
}
