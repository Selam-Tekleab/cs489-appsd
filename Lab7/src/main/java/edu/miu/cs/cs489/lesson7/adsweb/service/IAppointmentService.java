package edu.miu.cs.cs489.lesson7.adsweb.service;


import edu.miu.cs.cs489.lesson7.adsweb.models.Appointment;

import java.util.List;

public interface IAppointmentService {
    Appointment save(Appointment appointment);

    List<Appointment> findAll();
}