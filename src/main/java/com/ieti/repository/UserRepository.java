package com.ieti.repository;

import com.ieti.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {

//    List<User> findByLastnameOrFirstname(String queryText);
//
//    List<User> findByStartDateAfter(String startDate);
}
