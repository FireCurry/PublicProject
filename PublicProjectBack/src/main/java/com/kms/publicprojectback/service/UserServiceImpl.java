package com.kms.publicprojectback.service;

import com.kms.publicprojectback.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    @Override
    public boolean idCheck(String username) {
        return userRepository.existsByUsername(username);
    }
}
