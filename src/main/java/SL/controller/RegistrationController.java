package SL.controller;

import SL.ViewModel;
import SL.model.User;
import SL.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by anton on 3/18/17.
 */
public class RegistrationController implements Controller {

    private final UserService userService;

    public RegistrationController(UserService userService) {
        this.userService = userService;
    }

    @Override
    public ViewModel process(HttpServletRequest request, HttpServletResponse response) {

        ViewModel vm = new ViewModel("postlogin");

        User user = new User();

        user.setUsername((String) request.getAttribute("username"));
        user.setPassword((String) request.getAttribute("password"));
        user.setEmail((String) request.getAttribute("email"));

        user = userService.save(user);

        if (user == null) {
            request.setAttribute("userExists", "User is already exist!");
        }

        return vm;
    }
}
