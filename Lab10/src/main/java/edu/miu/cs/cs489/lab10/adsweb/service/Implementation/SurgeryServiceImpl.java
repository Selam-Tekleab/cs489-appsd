package edu.miu.cs.cs489.lab10.adsweb.service.Implementation;

import edu.miu.cs.cs489.lab10.adsweb.dao.SurgeryRepository;
import edu.miu.cs.cs489.lab10.adsweb.models.Surgery;
import edu.miu.cs.cs489.lab10.adsweb.service.ISurgeryService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SurgeryServiceImpl implements ISurgeryService {

    @Autowired
    private SurgeryRepository surgeryRepository;

    public Surgery save(Surgery surgery) {
        return surgeryRepository.save(surgery);
    }
}