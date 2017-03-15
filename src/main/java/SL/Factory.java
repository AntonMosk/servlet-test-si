package SL;


import SL.controller.Controller;
import SL.controller.HomeController;

/**
 * Created by anton on 3/14/17.
 */
public class Factory {
    public static Controller getHomeController() {
        return new HomeController();
    }
}
