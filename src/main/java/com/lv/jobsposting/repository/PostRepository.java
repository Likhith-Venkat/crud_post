package com.lv.jobsposting.repository;

import com.lv.jobsposting.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {
}
