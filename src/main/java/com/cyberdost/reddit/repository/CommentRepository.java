package com.cyberdost.reddit.repository;

import com.cyberdost.reddit.model.Comment;
import com.cyberdost.reddit.model.Post;
import com.cyberdost.reddit.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
}