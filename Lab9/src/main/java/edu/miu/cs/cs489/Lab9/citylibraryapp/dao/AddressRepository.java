package edu.miu.cs.cs489.Lab9.citylibraryapp.dao;

import edu.miu.cs.cs489.Lab9.citylibraryapp.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AddressRepository extends JpaRepository<Address, Long> {
    List<Address> findAllByOrderByCityAsc();
}
