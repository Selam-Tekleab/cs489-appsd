package edu.miu.cs.cs489.lab10.adsweb.dto.patient;

import edu.miu.cs.cs489.lab10.adsweb.models.Address;
import edu.miu.cs.cs489.lab10.adsweb.models.Appointment;

import java.util.List;

public record PatientResponse(
        Long patNo,
        String firstName,
        String lastName,
        String email,
        String phoneNumber,
        Address address,
        List<Appointment> appointments
) {
}
