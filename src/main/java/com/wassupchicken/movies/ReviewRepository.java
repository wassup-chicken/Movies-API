package com.wassupchicken.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

//data access layer , does the job of actually talking to the database
@Repository
public interface ReviewRepository extends MongoRepository<Review, ObjectId> {
}
