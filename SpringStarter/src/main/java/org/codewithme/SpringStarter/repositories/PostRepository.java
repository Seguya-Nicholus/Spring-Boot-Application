package org.codewithme.SpringStarter.repositories;

import org.codewithme.SpringStarter.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    
} 
