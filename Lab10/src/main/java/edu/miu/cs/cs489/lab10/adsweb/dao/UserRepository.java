package edu.miu.cs.cs489.lab10.adsweb.dao;

import edu.miu.cs.cs489.lab10.adsweb.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);

}
