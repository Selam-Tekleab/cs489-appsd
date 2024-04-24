package edu.miu.cs.cs489.lesson7.adsweb.service.Implementation;

import edu.miu.cs.cs489.lesson7.adsweb.dao.UserRepository;
import edu.miu.cs.cs489.lesson7.adsweb.models.Users;
import edu.miu.cs.cs489.lesson7.adsweb.service.IUserService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Users save(Users users) {
        return userRepository.save(users);
    }
}
