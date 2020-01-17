package pl.edu.ug.sgpwcr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.ug.sgpwcr.dao.UserRepository;
import pl.edu.ug.sgpwcr.domain.User;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserService {
    UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User addNewUser(User user){
        if (userRepository.findByEmail(user.getEmail()) != null || userRepository.findByLogin(user.getLogin()) != null){
            return null;
        }
        return userRepository.save(user);
    }

}
