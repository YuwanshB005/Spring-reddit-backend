package com.cyberdost.reddit.repository;

import com.cyberdost.reddit.model.Subreddit;
import com.cyberdost.reddit.model.Post;
import com.cyberdost.reddit.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);
}