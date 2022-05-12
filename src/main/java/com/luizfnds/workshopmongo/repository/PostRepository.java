package com.luizfnds.workshopmongo.repository;

import com.luizfnds.workshopmongo.domain.Post;
import com.luizfnds.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}
