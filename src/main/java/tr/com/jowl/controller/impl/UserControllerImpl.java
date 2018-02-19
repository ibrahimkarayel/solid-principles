package tr.com.jowl.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import tr.com.jowl.controller.UserController;
import tr.com.jowl.model.User;
import tr.com.jowl.services.UserService;

import java.util.List;

public class UserControllerImpl implements UserController {

    @Autowired
    private UserService userService;

    public void save(User user) {
        userService.save(user);

    }

    public void update(User user) {
        userService.update(user);

    }

    public List<User> findAll() {
        return userService.findAll();
    }
}
