package edu.miu.cs.cs489.Lab9.citylibraryapp.service;

import edu.miu.cs.cs489.Lab9.citylibraryapp.models.Address;

import java.util.List;

public interface IAddressService {
    Address save(Address address);
    List<Address> getAllAddresses();
    String getAllAddressesWithPatientsInJSON();
}
