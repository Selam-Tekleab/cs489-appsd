package edu.miu.cs.cs489.Lab9.citylibraryapp.dao;

import edu.miu.cs.cs489.Lab9.citylibraryapp.models.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointementRepository extends JpaRepository<Appointment, Long> {
}
