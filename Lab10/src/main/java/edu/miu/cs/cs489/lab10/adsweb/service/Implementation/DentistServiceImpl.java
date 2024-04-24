package edu.miu.cs.cs489.lab10.adsweb.service.Implementation;

import edu.miu.cs.cs489.lab10.adsweb.dao.DentistRepository;
import edu.miu.cs.cs489.lab10.adsweb.models.Dentist;
import edu.miu.cs.cs489.lab10.adsweb.service.IDentistService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class DentistServiceImpl implements IDentistService {

    @Autowired
    private DentistRepository dentistRepository;

    public Dentist save(Dentist dentist) {
        return dentistRepository.save(dentist);
    }
}