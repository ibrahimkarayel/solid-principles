package tr.com.jowl.controller;

import tr.com.jowl.model.User;

import java.util.List;

public interface UserController {

    void save(User user);

    void update(User user);

    List<User> findAll();
}
