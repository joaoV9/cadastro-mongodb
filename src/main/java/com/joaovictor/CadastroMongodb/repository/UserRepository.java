package com.joaovictor.CadastroMongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.joaovictor.CadastroMongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
