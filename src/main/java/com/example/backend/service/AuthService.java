package com.example.backend.service;
import com.example.backend.model.User;
import com.example.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AuthService {
    @Autowired
    private UserRepository userRepository;
    public User signup(User user) {
     return userRepository.save(user);
          }   
           public boolean login(String email,
                         String password) {

        User user = userRepository
                        .findByEmail(email)
                        .orElse(null);

        if (user == null) {
            return false;
        }

        return user.getPassword()
                .equals(password);
    }
}