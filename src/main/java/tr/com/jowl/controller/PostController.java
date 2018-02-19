package tr.com.jowl.controller;

import tr.com.jowl.model.Post;

import java.util.List;

public interface PostController {
   void save(Post post);
   List<Post> findAll();

}
