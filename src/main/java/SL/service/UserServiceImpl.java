package SL.service;

import SL.dao.UserDao;
import SL.model.User;

import java.sql.SQLException;

/**
 * Created by anton on 3/18/17.
 */
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User save(User user) {
        try {
            userDao.save(user);
        } catch (SQLException e) {
            user = null;
        }
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
