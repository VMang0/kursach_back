package com.example.hotel.repositories;

import com.example.hotel.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
    Optional<User> findOneByEmailAndPassword(String email, String password);
}
