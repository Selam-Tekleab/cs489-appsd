package edu.miu.cs.cs489.lab10.adsweb.dao;

import edu.miu.cs.cs489.lab10.adsweb.models.Surgery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurgeryRepository extends JpaRepository<Surgery, Long> {
}
