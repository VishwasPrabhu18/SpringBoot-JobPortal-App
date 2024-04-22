package com.joblisting.jobportalbackend.repository;

import com.joblisting.jobportalbackend.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {

}
