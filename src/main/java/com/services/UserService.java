package com.services;

import com.DAO.UserRepository;
import com.models.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserEntity registerNewUser(UserEntity user) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String passwordEncode = passwordEncoder.encode(user.getPassword());
        user.setPassword(passwordEncode);

        return userRepository.save(user);
    }
}
