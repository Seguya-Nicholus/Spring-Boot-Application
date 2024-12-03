package org.codewithme.SpringStarter.config;

import java.util.List;

import org.codewithme.SpringStarter.models.Account;
import org.codewithme.SpringStarter.models.Post;
import org.codewithme.SpringStarter.services.AccountService;
import org.codewithme.SpringStarter.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class SeedData implements CommandLineRunner {

    @Autowired
    private PostService postService;

    @Autowired
    private AccountService accountService;
    
    @Override
    public void run(String... args) throws Exception {

        Account account1 = new Account();
        Account account2 = new Account();
        Account account3 = new Account();

        // ====== User Account 1 ======
        account1.setEmail("account1@gmail.com");
        account1.setPassword("password");
        account1.setFirstname("user01");

        // ====== User Account 2 ======
        account2.setEmail("account2@gmail.com");
        account2.setPassword("password");
        account2.setFirstname("user02");

        // ====== User Account 3 ======
        account3.setEmail("account3@gmail.com");
        account3.setPassword("password");
        account3.setFirstname("user03");

        accountService.save(account1);
        accountService.save(account2);
        accountService.save(account3);

        List<Post> posts = postService.getAll();

        if(posts.size() == 0){
            Post post01 = new Post();
            post01.setTitle("Post01");
            post01.setBody("Post 01 Body .................");
            post01.setAccount(account1);
            postService.savePost(post01);


            Post post02 = new Post();
            post02.setTitle("Post02");
            post02.setBody("Post 02 Body .................");
            post02.setAccount(account2);
            postService.savePost(post02);

            Post post03 = new Post();
            post03.setTitle("Post03");
            post03.setBody("Post 03 Body .................");
            post03.setAccount(account3);
            postService.savePost(post03);

            // postService.deletePost(post01);
            // postService.deletePost(post02);
            // postService.deletePost(post03);

        }
    
    
    }
    
}
