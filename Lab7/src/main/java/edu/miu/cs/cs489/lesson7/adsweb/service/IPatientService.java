package edu.miu.cs.cs489.lesson7.adsweb.service;

import edu.miu.cs.cs489.lesson7.adsweb.dto.patient.PatientRequest;
import edu.miu.cs.cs489.lesson7.adsweb.models.Patient;

import java.util.List;

public interface IPatientService {
    Patient save(Patient dentist);
    List<Patient> getAllPatients();
    Patient getPatientById(int id);
    void deletePatientById(int id);
    Patient updatePatient(int id, PatientRequest patient);
   List<Patient> getPatientsWithSearchString(String searchString);
}
