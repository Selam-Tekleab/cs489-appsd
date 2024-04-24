package edu.miu.cs.cs489.lesson7.adsweb.service;

import edu.miu.cs.cs489.lesson7.adsweb.models.Address;

import java.util.List;

public interface IAddressService {
    Address save(Address address);
    List<Address> getAllAddresses();
    String getAllAddressesWithPatientsInJSON();
}
