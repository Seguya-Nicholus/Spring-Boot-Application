package org.codewithme.SpringStarter.config;

import java.util.List;

import org.codewithme.SpringStarter.models.Post;
import org.codewithme.SpringStarter.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class SeedData implements CommandLineRunner {

    @Autowired
    private PostService postService;
    
    @Override
    public void run(String... args) throws Exception {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'run'");
        List<Post> posts = postService.getAll();

        if(posts.size() == 0){
            Post post01 = new Post();
            post01.setTitle("Post01");
            post01.setBody("Post 01 Body .................");
            postService.savePost(post01);


            Post post02 = new Post();
            post02.setTitle("Post02");
            post02.setBody("Post 02 Body .................");
            postService.savePost(post02);

            Post post03 = new Post();
            post03.setTitle("Post03");
            post03.setBody("Post 03 Body .................");
            postService.savePost(post03);

            // postService.deletePost(post01);
            // postService.deletePost(post02);
            // postService.deletePost(post03);

        }
    
    
    }
    
}
