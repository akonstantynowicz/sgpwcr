package pl.edu.ug.sgpwcr.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.edu.ug.sgpwcr.domain.User;
import pl.edu.ug.sgpwcr.service.UserService;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/api/user")
    User addPerson(@RequestBody User user) {
        User userToAdd = new User(user.getEmail(), user.getLogin(),user.getPassword());
        userService.addNewUser(userToAdd);
        return userToAdd;
    }

}
