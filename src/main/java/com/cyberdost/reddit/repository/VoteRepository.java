package com.cyberdost.reddit.repository;

import com.cyberdost.reddit.model.Post;
import com.cyberdost.reddit.model.User;
import com.cyberdost.reddit.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}