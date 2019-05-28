package com.romanstetsiuk.final_app_sda.repository;

import com.romanstetsiuk.final_app_sda.model.MyEvent;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "myEvent", path = "/myEvent")
public interface MyEventRepository extends MongoRepository<MyEvent, String> {
}
