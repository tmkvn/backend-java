package com.tacuri.user.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.tacuri.user.controller.api.UserAPI;
import com.tacuri.user.domain.User;
import com.tacuri.user.dto.UserDto;
import com.tacuri.user.mapper.UserDtoMapper;
import com.tacuri.user.service.UserService;

@RestController
public class UserController implements UserAPI {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @Override
    public ResponseEntity<UserDto> save(UserDto userDto) {
        User user = userService.save(UserDtoMapper.INSTANCE.toDomain(userDto));
        return new ResponseEntity<>(UserDtoMapper.INSTANCE.toDto(user), HttpStatus.CREATED);
    }

}
