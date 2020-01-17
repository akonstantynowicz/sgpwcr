package pl.edu.ug.sgpwcr.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.edu.ug.sgpwcr.dao.UserRepository;
import pl.edu.ug.sgpwcr.domain.User;
import pl.edu.ug.sgpwcr.service.UserService;

import java.util.List;

@RestController
public class UserController {

    UserService userService;
    UserRepository userRepository;

    @Autowired
    public UserController(UserService userService, UserRepository userRepository) {
        this.userService = userService;
        this.userRepository = userRepository;
    }

    @GetMapping("/api/user")
    public List<User> getUsers() {
        return (List<User>) userRepository.findAll();
    }

    @PostMapping("/api/user")
    User addPerson(@RequestBody User user) {
        User userToAdd = new User(user.getEmail(), user.getLogin(),user.getPassword());
        userService.addNewUser(userToAdd);
        return userToAdd;
    }

}
