package com.uniqueusernameannotation.uniqueusernameannotation.repository;

import com.uniqueusernameannotation.uniqueusernameannotation.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    User findByUsername(String username);
}
