package com.tacuri.user.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tacuri.user.domain.User;
import com.tacuri.user.mapper.UserEntityMapper;
import com.tacuri.user.repository.UserEntityRepository;
import com.tacuri.user.service.UserService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceimpl implements UserService{

    private final UserEntityRepository userEntityRepository;

    @Override
    public List<User> findAll() {
        return UserEntityMapper.INSTANCE.toDomains(userEntityRepository.findAll());
    }

    @Override
    public User save(User user) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }
    
}
