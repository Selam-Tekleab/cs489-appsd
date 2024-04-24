package edu.miu.cs.cs489.lab10.adsweb.dao;

import edu.miu.cs.cs489.lab10.adsweb.models.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointementRepository extends JpaRepository<Appointment, Long> {
}
