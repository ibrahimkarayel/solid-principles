package tr.com.jowl.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import tr.com.jowl.controller.MainController;
import tr.com.jowl.model.Post;
import tr.com.jowl.model.User;

import java.util.List;

public class MainControllerImpl implements MainController {

    @Autowired
    private MainController mainController;

    public void send(String subject, String to) {
        mainController.send(subject, to);
    }

    public void savePost(Post post) {

    }

    public List<User> findAllUser() {
        return null;
    }

    public List<Post> findAllPost() {
        return null;
    }
}
