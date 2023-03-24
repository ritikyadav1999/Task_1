package com.godsplan.project.repository;

import com.godsplan.project.model.Server;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ServerRepository extends MongoRepository<Server,String> {

    List<Server> findByName(String name);
}
