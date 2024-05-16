package com.lv.jobsposting.repository;

import com.lv.jobsposting.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
