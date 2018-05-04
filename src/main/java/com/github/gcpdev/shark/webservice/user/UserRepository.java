package com.github.gcpdev.shark.webservice.user;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface UserRepository extends MongoRepository<WebServiceUser, String> {

    WebServiceUser findByUsername(String username);

}