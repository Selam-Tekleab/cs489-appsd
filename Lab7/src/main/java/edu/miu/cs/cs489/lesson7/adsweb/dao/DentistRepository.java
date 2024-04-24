package edu.miu.cs.cs489.lesson7.adsweb.dao;

import edu.miu.cs.cs489.lesson7.adsweb.models.Dentist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DentistRepository extends JpaRepository<Dentist, Long> {
}
