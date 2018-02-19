package tr.com.jowl.services;

import tr.com.jowl.model.User;

import java.util.List;

public interface UserService {

    void save(User user);

    void update(User user);

    List<User> findAll();
}
