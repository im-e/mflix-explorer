package com.ime.mflix.model.repositories;

import com.ime.mflix.model.entities.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface UsersRepository extends MongoRepository<Users, String> {
    Optional<Users> findBy_id(String _id);
    List<Users>findUsersByName(String name);
    Optional<Users>  findUserByEmail(String email);
}
