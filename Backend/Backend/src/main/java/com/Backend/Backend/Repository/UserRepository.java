package com.Backend.Backend.Repository;
import com.Backend.Backend.Models.Users;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.Optional;

public interface UserRepository extends MongoRepository<Users, String> {

    // Find user by email
    Optional<Users> findByEmail(String email);

    // Check if a user exists by email
    boolean existsByEmail(String email);
}