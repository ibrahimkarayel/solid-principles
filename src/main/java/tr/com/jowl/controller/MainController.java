package tr.com.jowl.controller;

import tr.com.jowl.model.Post;
import tr.com.jowl.model.User;

import java.util.List;

public interface MainController {

    void send(String subject, String to);

    void savePost(Post post);

    List<User> findAllUser();

    List<Post> findAllPost();


}
