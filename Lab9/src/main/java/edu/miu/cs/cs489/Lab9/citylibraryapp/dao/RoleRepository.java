package edu.miu.cs.cs489.Lab9.citylibraryapp.dao;

import edu.miu.cs.cs489.Lab9.citylibraryapp.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long>{
    Optional<Role> findByName(String name);

}
