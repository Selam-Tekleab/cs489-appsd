package edu.miu.cs.cs489.lab10.adsweb.service;


import edu.miu.cs.cs489.lab10.adsweb.models.Appointment;

import java.util.List;

public interface IAppointmentService {
    Appointment save(Appointment appointment);

    List<Appointment> findAll();
}