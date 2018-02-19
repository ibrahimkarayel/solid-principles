package tr.com.jowl.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import tr.com.jowl.controller.PostController;
import tr.com.jowl.model.Post;
import tr.com.jowl.services.PostService;

import java.util.List;

public class PostControllerImpl implements PostController {

    @Autowired
    private PostService postService;
    public void save(Post post) {
        postService.save(post);

    }

    public List<Post> findAll() {
        return null;
    }
}
