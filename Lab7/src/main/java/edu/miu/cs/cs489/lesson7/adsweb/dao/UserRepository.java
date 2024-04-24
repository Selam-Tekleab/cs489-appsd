package edu.miu.cs.cs489.lesson7.adsweb.dao;

import edu.miu.cs.cs489.lesson7.adsweb.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
}
