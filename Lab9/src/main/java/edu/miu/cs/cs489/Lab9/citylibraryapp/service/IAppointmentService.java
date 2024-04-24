package edu.miu.cs.cs489.Lab9.citylibraryapp.service;

import edu.miu.cs.cs489.Lab9.citylibraryapp.models.Appointment;

import java.util.List;

public interface IAppointmentService {
    Appointment save(Appointment appointment);

    List<Appointment> findAll();
}