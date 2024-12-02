package org.codewithme.SpringStarter.services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.codewithme.SpringStarter.models.Post;
import org.codewithme.SpringStarter.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;

    public Optional<Post> getById(Long id){
        return postRepository.findById(id);
    }

    public List<Post> getAll(){
        return postRepository.findAll();
    }

    public void deletePost(Post post){
        postRepository.delete(post);
    }

    public Post savePost(Post post){
        if(post.getId() == null){
            post.setCreatedAt(LocalDateTime.now());
        }
        return postRepository.save(post);
    }

    
}
