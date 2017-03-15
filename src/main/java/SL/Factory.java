package SL;


import SL.controller.Controller;
import SL.controller.HomeController;
import SL.controller.LoginController;

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
}
