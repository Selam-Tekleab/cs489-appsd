package edu.miu.cs.cs489.lab10.adsweb.service.Implementation;

import edu.miu.cs.cs489.lab10.adsweb.dao.UserRepository;
import edu.miu.cs.cs489.lab10.adsweb.models.User;
import edu.miu.cs.cs489.lab10.adsweb.service.IUserService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User save(User users) {
        return userRepository.save(users);
    }
}
