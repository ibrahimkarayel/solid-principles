package tr.com.jowl.services;

import tr.com.jowl.model.Post;

import java.util.List;

public interface PostService {
   void save(Post post);
   List<Post> findAll();

}
