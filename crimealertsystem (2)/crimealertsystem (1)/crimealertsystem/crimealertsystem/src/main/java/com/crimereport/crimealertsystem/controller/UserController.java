package com.crimereport.crimealertsystem.controller;

import com.crimereport.crimealertsystem.model.User;
import com.crimereport.crimealertsystem.repository.UserRepository;
import com.crimereport.crimealertsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.*;
import java.util.Map;
@RestController
@RequestMapping("/api/users")
//@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody User user) {
        return ResponseEntity.ok(userRepository.save(user));
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Map<String, String> credentials) {
        User user = userRepository.findByEmail(credentials.get("email"));
        if (user != null && user.getPassword().equals(credentials.get("password"))) {
            return ResponseEntity.ok("Login Success");
        }
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid Credentials");
    }
}
