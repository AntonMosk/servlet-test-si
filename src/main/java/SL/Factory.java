package SL;


import SL.controller.Controller;
import SL.controller.HomeController;
import SL.controller.LoginController;
import SL.controller.RegistrationController;
import SL.dao.UserDao;
import SL.dao.UserDaoImpl;
import SL.service.UserService;
import SL.service.UserServiceImpl;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 * Created by anton on 3/14/17.
 */
public class Factory {
    public static Controller getHomeController() {
        return new HomeController();
    }

    public static Controller getLoginController() {
        return new LoginController();
    }

    public static Controller getRegistrationController(UserService userService) {
        return new RegistrationController(userService);
    }

    public static UserService getUserServiceImpl(UserDao userDao) {
        return new UserServiceImpl(userDao);
    }

    public static UserDao getUserDaoImpl(Connection connection) {
        return new UserDaoImpl(connection);

    }

    public static Connection getConnection() {
        Connection connection = null;

        String url = "jdbc:h2:tcp://localhost/~/test";
        String username = "sa";
        String password = "";

        try {
            Class.forName("org.h2.Driver").newInstance();
            connection = DriverManager.getConnection(url, username, password);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return connection;
    }

}
