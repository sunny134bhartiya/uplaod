package com.uplaod.pic.repository;

import com.uplaod.pic.model.Photo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PhotoRepository extends MongoRepository<Photo, String> {

}